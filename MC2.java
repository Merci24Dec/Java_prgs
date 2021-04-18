import java.lang.*;
abstract class myclass
{
abstract void cal(int x);{}
}
class subclass1 extends myclass 
{
void cal(int x)
{
System.out.println("Square ="+(x*x));
}
}
class subclass2 extends myclass 
{
void cal(int x)
{
System.out.println("Cube of a Number ="+(x*x*x));
}
}
class subclass3 extends myclass 
{
void cal(int x)
{
System.out.println("Square Root ="+Math.sqrt(x));
}
}
class MC2
{
public static void main(String args[])
{
subclass1 obj1=new subclass1();
subclass2 obj2=new subclass2();
subclass3 obj3=new subclass3();
obj1.cal(5);
obj2.cal(10);
obj3.cal(25);
}
}
