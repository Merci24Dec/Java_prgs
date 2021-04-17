interface A
{ 
void show1();
}
interface B
{
void show2();
}
class C implements A,B
{
public void show1()
{
System.out.println("Hello");
}
public void show2()
{
System.out.println("How are you");
}
public static void main(String args[])
{
C obj =new C();
obj.show1();
obj.show2();
}
}
