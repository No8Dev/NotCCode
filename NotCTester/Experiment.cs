// comment
using static System.Console;

public class Experiment
{
    const string Title = "NotC code";
    private string? SubTitle { get; set; }

    void Main(string[] args)
    {
        SubTitle = "!C sub-title";
        WriteTitle();
    }

    void WriteTitle()
    {
        WriteLine(Title);
        if (SubTitle != null)
            WriteLine(SubTitle);
    }
}