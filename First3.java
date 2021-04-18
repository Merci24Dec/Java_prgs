import java.lang.*;
class X
{
 void show()
{
System.out.println("I am in base class");
}
}
class Y extends X
{
}

class Z extends Y
{
Z()
{
super.show();
}
}
class First3
{
public static void main(String args[])
{
Z obj=new Z();

 }
}

