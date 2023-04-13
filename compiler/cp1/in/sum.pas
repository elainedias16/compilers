program sum;
var
    X, Y : real;

const
    const_1 = 10;
begin
    write('This program will sum two numbers!');

    write('Please, type the first one: ');
    read(X);

    write('Please, type the another one: ');
    read(Y);

    write('X + Y =  ' , X + Y);
    write('X - Y =  ' , X - Y);
    write('X * Y =  ' , X * Y);
    write('X / Y =  ' , X / Y);
    //Write('X mod Y =  ' , X mod Y);

    write(const_1);
end.