using System.CodeDom.Compiler;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace NotCCode;

/// <summary>
/// 
/// </summary>
public class NotCConverter
{
    private readonly SourceInfo _info;

    public string Result { get; private set; } = "";
    public NotCConverter(SourceInfo info)
    {
        _info = info;
    }

    public bool Go()
    {
        // Input, tokenise the input, Parse the tokens
        var input = new AntlrInputStream(_info.Source);
        var lexer = new NotCLexer(input);
        var tokens = new CommonTokenStream(lexer, new[]{ TokenConstants.DefaultChannel, NotCLexer.COMMENTS_CHANNEL });
        var parser = new NotCParser(tokens);

        var tree = parser.compilation_unit();
        //if (parser.NumberOfSyntaxErrors > 0)
        //    return false;
        
        // Walk over the parsed tokens
        var visitor = new NotCListener(_info);
        ParseTreeWalker.Default.Walk(visitor, tree);
        
        // Return converted code
        Result = visitor.Result;
        return true;
    }
}

class NotCListener : NotCParserBaseListener
{
    private readonly SourceInfo _info;
    private readonly StringBuilder _sb;
    private StringWriter _sw;
    private IndentedTextWriter _tw;

    public NotCListener(SourceInfo info)
    {
        _info = info;
        _sb = new();
        _sw = new(_sb);
        _tw = new(_sw);
    }
    
    public static string GetFullText(ParserRuleContext context)
    {
        if (context.Start.StartIndex < 0 || 
            context.Stop.StopIndex < 0)
            return context.GetText(); // Fallback

        return context.Start.InputStream.GetText(
            Interval.Of(context.Start.StartIndex, context.Stop.StopIndex));
    }

    private void OutputLines(ParserRuleContext context)
    {
        var block = GetFullText(context);
        var lines = block.Split('\n');

        foreach (var line in lines)
            _tw.WriteLine(line);
    }
    
    public override void EnterCompilation_unit(NotCParser.Compilation_unitContext context)
    {
    }

    public override void ExitCompilation_unit(NotCParser.Compilation_unitContext context)
    {
        if (_outputClass)
        {
            _tw.Indent--;
            _tw.WriteLine("}");
        }
        _outputClass = false;
    }

    public override void EnterUsing_directives(NotCParser.Using_directivesContext context)
    {
        foreach (var usingDirective in context.children)
        {
            if (usingDirective is NotCParser.UsingModuleDirectiveContext)
            {
                _tw.WriteLine($"using static {usingDirective.GetChild(2).GetText()};");    
            }
            else
            {
                if (usingDirective.Payload is ParserRuleContext rule)
                    OutputLines(rule);
            }
        }
    }

    public override void ExitUsing_directives(NotCParser.Using_directivesContext context)
    {
        OutputUsing();
    }

    private void OutputUsing()
    {
        if (!_outputUsing)
        {
            _outputUsing = true;
            _tw.WriteLine("using static System.Console;");
            _tw.WriteLine("using static System.Math;");
        }
    }
    
    private bool _outputUsing;
    private bool _outputClass;
    public override void EnterClass_member_declaration(NotCParser.Class_member_declarationContext context)
    {
        OutputUsing();
        if (!_outputClass)
        {
            _outputClass = true;
            _tw.WriteLine($$"""
                            internal static partial class {{_info.Name}}
                            {
                            """);
            _tw.Indent++;

        }

        if (IsComment(context))
        {
            OutputLines(context);
            return;
        }
        
        var lineNo = context.Start.Line;
        _tw.WriteLine($"#line {lineNo} \"{_info.Filename}\"");

        var (needsPublic, needsStatic) = CheckMember(context);
        if (needsPublic)
            _tw.Write("public ");
        if (needsStatic)
            _tw.Write("static ");

        OutputLines(context);
    }

    private bool IsComment(ParserRuleContext context)
    {
        if (context.Start.Channel == NotCLexer.COMMENTS_CHANNEL)
            return true;
        
        return context.Start.Type is 
            NotCParser.SINGLE_LINE_COMMENT or 
            NotCParser.SINGLE_LINE_DOC_COMMENT or 
            NotCParser.EMPTY_DELIMITED_DOC_COMMENT or 
            NotCParser.DELIMITED_DOC_COMMENT or 
            NotCParser.DELIMITED_COMMENT;
    }

    private (bool needsPublic, bool needsStatic) CheckMember(NotCParser.Class_member_declarationContext context)
    {
        if (context.Start.Type == NotCParser.CONST)
            return (true, false);

        bool needsPublic = true;
        bool needsStatic = true;
        if (context.ChildCount >= 2)
        {
            if (context.GetChild(0) is NotCParser.All_member_modifiersContext modifiers)
            {
                foreach (var parseTree in modifiers.children)
                {
                    var modifier = (NotCParser.All_member_modifierContext)parseTree;
                    if (modifier.Start.Type 
                        is NotCParser.PUBLIC 
                        or NotCParser.INTERNAL 
                        or NotCParser.PRIVATE)
                        needsPublic = false;
                }
            }

            if (context.GetChild(1) is NotCParser.Common_member_declarationContext { Start.Type: NotCParser.CONST }) 
                needsStatic = false;
        }

        return (needsPublic, needsStatic);
    }

    public override void VisitErrorNode(IErrorNode node)
    {
        var line = node.Symbol.Line;
        var col = node.Symbol.Column;
        
        _tw.WriteLine($"Error ({line}:{col}) {node}");
    }

    public string Result => _sb.ToString();
}

