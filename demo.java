class one
{
 int i=15;
 void show()
{
   System.out.println("super class");
}
}
class two extend one
int i=30;
void show()
{
System.out.println("sub class");
System.out.println(i);
System.out.println(super i);
super.show();
}
class demo
{
public static void main(String args[])
{
two.b1=new two();
b1.show()
}
}

