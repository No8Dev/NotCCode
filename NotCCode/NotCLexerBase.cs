using Antlr4.Runtime;

namespace NotCCode;

public abstract class NotCLexerBase : Lexer
{
    protected NotCLexerBase(ICharStream input) : base(input)
    {
        _input = input;
    }

    protected NotCLexerBase(ICharStream input, TextWriter output, TextWriter errorOutput)
        : base(input, output, errorOutput)
    {
        _input = input;
    }

    private readonly ICharStream _input;
    protected int InterpolatedStringLevel;
    protected readonly Stack<bool> InterpolatedVerbatiums = new Stack<bool>();
    protected readonly Stack<int> CurlyLevels = new Stack<int>();
    protected bool Verbatium;

    protected void OnInterpolatedRegularStringStart()
    {
        InterpolatedStringLevel++;
        InterpolatedVerbatiums.Push(false);
        Verbatium = false;
    }

    protected void OnInterpolatedVerbatiumStringStart()
    {
        InterpolatedStringLevel++;
        InterpolatedVerbatiums.Push(true);
        Verbatium = true;
    }

    protected void OnOpenBrace()
    {
        if (InterpolatedStringLevel > 0)
        {
            CurlyLevels.Push(CurlyLevels.Pop() + 1);
        }
    }

    protected void OnCloseBrace()
    {
        if (InterpolatedStringLevel > 0)
        {
            CurlyLevels.Push(CurlyLevels.Pop() - 1);
            if (CurlyLevels.Peek() == 0)
            {
                CurlyLevels.Pop();
                Skip();
                PopMode();
            }
        }
    }

    protected void OnColon()
    {

        if (InterpolatedStringLevel > 0)
        {
            int ind = 1;
            bool switchToFormatString = true;
            while ((char)_input.LA(ind) != '}')
            {
                if (_input.LA(ind) == ':' || _input.LA(ind) == ')')
                {
                    switchToFormatString = false;
                    break;
                }

                ind++;
            }

            if (switchToFormatString)
            {
                this.Mode(NotCLexer.INTERPOLATION_FORMAT);
            }
        }
    }

    protected void OpenBraceInside()
    {
        CurlyLevels.Push(1);
    }

    protected void OnDoubleQuoteInside()
    {
        InterpolatedStringLevel--;
        InterpolatedVerbatiums.Pop();
        Verbatium = (InterpolatedVerbatiums.Count() > 0 ? InterpolatedVerbatiums.Peek() : false);
    }

    protected void OnCloseBraceInside()
    {
        CurlyLevels.Pop();
    }

    protected bool IsRegularCharInside()
    {
        return !Verbatium;
    }

    protected bool IsVerbatiumDoubleQuoteInside()
    {
        return Verbatium;
    }
}
