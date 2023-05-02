program Array_test_1;
var
    v : array[0 .. 10] of real;
    i : integer;
    x : real;
    

begin
    i := 0;
    x := 4.8;


    while i < 10 do
    begin
        v[i]:= x + i;
        writeln(v[i]);
        i := i + 1;
    end;

end.