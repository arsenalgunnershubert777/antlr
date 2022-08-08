program Test9; (*Tests for special expressions*)
var
r, d, c, x, grade: real; 
yes, no, z : boolean;
p : boolean = true;

begin
   z := true;
   x := 1;
   c := 1.2;
   
   (*test basic input output*)
   writeln('hello my friend, x =', x);
   writeln('input a different real value for x');
   readln(x);
   writeln('you made x ', x);

   (*test special math functions*)
   writeln('the sqrt of 144 is ', sqrt(144)); (*outputs 12*)
   writeln('the sqrt of x is ', sqrt(x)); (*output depends on user input*)
   writeln('sin of 1.2 radians is ', sin(c)); (*outputs 0.932*)
   writeln('natural log of 10 is ', ln(10)); (*outputs 2.32*)
   writeln('input a real value for c ');
   readln(c);
   writeln('the exp c is ', exp(c)); (*output depends on user input*)

end. 