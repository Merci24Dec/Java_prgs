import java.lang.*;
class A
{
static void calculate(double x)
{
System.out.println("Square of a number:"+(x*x));
}
}
class B extends A
{
static void calculate(double y)
{
System.out.println("Square root of a number:"+Math.sqrt(y));
}
}
class First2
{
public static void main(String args[])
{
B obj=new B();
A obj1=new A();
obj.calculate(5.0);
obj1.calculate(5.0);
 }
}

