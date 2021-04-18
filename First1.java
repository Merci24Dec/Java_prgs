import java.lang.*;
class A
{
void calculate(double x)
{
System.out.println("Square of a number:"+(x*x));
}
}
class B extends A
{
void calculate(double y)
{
System.out.println("Square root of a number:"+Math.sqrt(y));
}
}
class First1
{
public static void main(String args[])
{
B obj=new B();
obj.calculate(5.0);
 }
}

