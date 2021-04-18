class myclass
{
void cal(int x)
{
System.out.println("Square of a number ="+(x*x));
}
}
class MC1
{
public static void main(String args[])
{
myclass obj1=new myclass ();
myclass obj2=new myclass();
myclass obj3=new myclass();
obj1.cal(3);
obj2.cal(4);
obj3.cal(5);
}
}
