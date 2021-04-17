import java.io.*;
class Factorial
{
public static void main(String args[])
{
int x,f=1,i=1;
x=Integer.parseInt(args[0]);
while(i<=x)
{
f=f*i;
i++;
}
System.out.println("The Factorial for the given number is"+f);
}
}
