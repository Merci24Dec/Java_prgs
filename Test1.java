import java.util.Scanner;
class Circle
{
double radius;
Circle ()
{}
Circle (double r)
{
radius=r;
System.out.println("Radius of the circle is: "+r);
}
}
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for radius of the circle:");
double r= sc.nextDouble();
Circle obj =new Circle(r);
}  
}