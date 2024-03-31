#!/bin/sh

java -jar ~/tools/antlr4.jar -Dlanguage=CSharp -message-format antlr -o ../NotCCode/Generated -package NotCCode -visitor ./NotCLexer.g4
java -jar ~/tools/antlr4.jar -Dlanguage=CSharp -message-format antlr -o ../NotCCode/Generated -package NotCCode -visitor ./NotCParser.g4

java -jar ~/tools/antlr4.jar -Dlanguage=CSharp -message-format antlr -o ./ -package NotCCode -visitor ./NotCLexer.g4
java -jar ~/tools/antlr4.jar -Dlanguage=CSharp -message-format antlr -o ./ -package NotCCode -visitor ./NotCParser.g4
