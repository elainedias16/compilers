program Array_test_3;
var
    v1 : array[0 .. 10] of integer;
    v2: array[0 .. 10] of real;
    v3: array[0 .. 10] of real;
    i : integer;
    x : real;
    

begin
    i := 0;
    x := 4.8;


    while i < 10 do
    begin
        v1[i] := i;
        v2[i]:= x + i;
        v3[i] := v2[i] + v1[i];
        writeln(v3[i]);
        i := i + 1;
    end;

end.