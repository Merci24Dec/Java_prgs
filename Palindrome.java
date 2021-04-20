class Palindrome
{
public static void main(String args[])
{
int a,s=0,x;
x=Integer.parseInt(args[0]);
while(x>0)
{
a=x%10;
s=(s*10)+a;
x=x/10;
}
System.out.println("Palindrome for the given number is"+s);
}
}
