using Antlr4.Runtime;

namespace NotCCode;

public abstract class NotCParserBase : Parser
{
    protected NotCParserBase(ITokenStream input)
        : base(input)
    {
    }

    protected NotCParserBase(ITokenStream input, TextWriter output, TextWriter errorOutput)
        : base(input, output, errorOutput)
    {
    }

    protected bool IsLocalVariableDeclaration()
    {
        var localVarDecl = Context as NotCParser.Local_variable_declarationContext;
        var localVariableType = localVarDecl?.local_variable_type();
        if (localVariableType == null) return true;
        return localVariableType.GetText() != "var";
    }
}
