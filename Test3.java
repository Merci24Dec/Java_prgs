import java.util.Scanner;
class Rectangle
{
int l,b;
Rectangle()
{}
Rectangle(int length,int breadth)
{
l=length;
b=breadth;
System.out.println("\n Area of the rectangle"+(l*b));
}
}
class Test3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for length of the rectangle:");
int length= sc.nextInt();
System.out.println("Enter the value for breadth of the rectangle:");
int breadth= sc.nextInt();
Rectangle obj =new Rectangle(length,breadth);
}  
}

