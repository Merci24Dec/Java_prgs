class F1
{
F1()
{
System.out.println("i AM IN BASE CLASS");
}
}
class F2 extends F1
{
F2()
{
System.out.println("I am in derived");
}
}
class T4
{
public static void main(String args[])
{
F2 obj =new F2();
}  
}

