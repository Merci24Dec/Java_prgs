import java.util.Scanner;
class Sum
{
int a,b;
Sum()
{
a=10;
b=20;
System.out.println("\n Sum of two numbers"+(a+b));
}
Sum(int x,int y)
{
a=x;
b=y;
System.out.println("\n Sum of two numbers"+(a+b));
}
}
class Test4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for 1ST element:");
int x= sc.nextInt();
System.out.println("Enter the value for 2ND element:");
int y= sc.nextInt();
Sum obj =new Sum();
Sum obj1 =new Sum(x,y);
}  
}

