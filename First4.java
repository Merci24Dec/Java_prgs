class X
{
 X()                     
{}
void show1()
{
System.out.println("I Am In Base Class");
} 
}
class Y extends X
{
Y()
{}
void show2()
{
System.out.println("I Am In Derived From Base/Super Class");
} 
}
class Z extends Y
{
Z()
{}
void show3()
{
System.out.println("I Am In Derived From Derived Class");
}
}
class First4
{
public static void main(String args[])
{
Z obj=new Z();
obj.show3();
obj.show2();
obj.show1();
 }
}

