program Array_test_1;
var
    v : array[0 .. 10] of integer;
    i : integer;
    

begin
    i := 0;

    while i < 10 do
    begin
        v[i]:= i;
        writeln(v[i]);
        i := i + 1;
    end;

end.