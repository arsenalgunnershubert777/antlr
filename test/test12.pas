program Test12; (*tests larger integrated systems*)
var
r, d, c, x, grade: real; 
y : real = sin(.56);
yes, no, z : boolean;
begin
    writeln('lets go on an adventure! pick a number between 1 and 5'); (*one bug is that you cannot use apostrophes :/*)
    readln(x);

    case (x) of
        1: writeln('jump once!');
        2: writeln('clap twice!');
        3: writeln('do three pushups!');
        4: writeln('do four jumping jacks!');
        5: writeln('spin around five times!');
        else:
        writeln('you picked ',x,'an invalid number :/');
    end;
    writeln('');
    writeln('now that you are warmed up you just need to answer a riddle to get the treasure!');
    writeln('a riddle is given to you: what can you swallow but can also swallow you?');
    writeln('options are 1: water, 2: pride, 3: fire, enter your number');
    readln(c);

    if (c = 1) then writeln('true but not the best answer');
    if (c = 3) then writeln('not really...');
    if (c = 2) then writeln('that is the best answer! You found the treasure! You get a digital smiley face! :)');

end. 