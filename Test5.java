import java.util.Scanner;
class Sample
{
public static int sum(int a,int b)
{
return (a+b);
}
}
class Test5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for 1st element:");
int x= sc.nextInt();
System.out.println("Enter the value for 2nd element:");
int y= sc.nextInt();
int c=Sample.sum(x,y);
System.out.println("Sum of two elements is="+c);
}  
}

