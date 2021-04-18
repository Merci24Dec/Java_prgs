class Fibonacci
{
public static void main(String args[])
{
int x=-1,y=1;
int n=5,i,z;
for(i=0;i<n;i++)
{ 
z=x+y;
System.out.println("The Fibonacci Series for the given number is"+z);
x=y;
y=z;
}
}
}
