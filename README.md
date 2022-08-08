# COP4020 Project 1

## Project Description and Motivation:
This is a basic pascal interpreter.

## Features:
1. Program Name (no args)
2. Variable Declarations
3. Main program block
4. Comments: (* ... *)
5. Basic arithmetic expressions with variables
6. Boolean/logical Expressions
7. Precedence of operators
8. Decision Making (if-then-else, case) - nested if-else-then and nested case implemented as well
9. Special Expressions: Readln, Writeln, sqrt, sin, cos, ln, exp

## Data Structures/Other things Used:
Map for variables, Stack for nested case statements, ArrayList for variable initializations, Scanner for input.

## Installation and Testing: 
Generate: antlr4 Pascal.g4
Compile: javac Pascal*.java 
Run tree: grun Pascal start -tree test/test_name.pas
Run gui: grun Pascal start -gui test/test_name.pas

test_names are as follows:
- test1_4.pas
- test5.pas
- test6.pas
- test7.pas
- test8.pas
- test9.pas
- test10.pas
- test11.pas
- test12.pas
- test13.pas

Some of these tests involve user input.

## Help Received:
https://www.tutorialspoint.com/pascal/
https://wiki.freepascal.org/
https://borlandpascal.fandom.com/wiki/
http://www.baskent.edu.tr/~tkaracay/etudio/ders/prg/pascal/PasHTM1/pas/pasl1002.html

## Contributors:
- Hubert Zhao

## Questions:
Contact me with any questions at hubert777@ufl.edu, thanks!