
using NotCCode;

Console.WriteLine("NotC CLI");

if (args.Length < 1)
    throw new ArgumentException("Pass the filename");

var source = File.ReadAllText(args[0]);
var filename = Path.GetFullPath(args[0]);
var name= Path.GetFileNameWithoutExtension(args[0]);

var info = new SourceInfo(filename, name, source);

var converter = new NotCConverter(info);
if (!converter.Go())
    throw new Exception("Bugger");

Console.WriteLine(converter.Result);
