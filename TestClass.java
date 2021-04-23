interface PI1
{
default void show()
{
System.out.println("Welcome");
}
}
interface PI2
{
default void show()
{
System.out.println("To GIET");
}
}
class TestClass implements PI1,PI2
{
public void show()
{
PI1.super.show();
PI2.super.show();
}
public static void main(String args[])
{
TestClass d=new TestClass();
d.show();
}
}
