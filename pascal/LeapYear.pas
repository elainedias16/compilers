program LeapYear;

var
    year : Integer;

procedure isLeapYear(year : Integer) ; 

begin
    if (year mod 400 = 0) or (year mod 4 = 0 and not (year mod 100 = 0))  Then
        return true;
end;

begin
    Writeln('Type an year: ');
    Readln(year);

    // isLeapYear(year);

    
end.