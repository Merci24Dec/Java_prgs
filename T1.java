class FIRST
{
int a,b;
}
class SECOND extends FIRST
{
void show(int x,int y)
{
a=x;
b=y;
System.out.println("Sum of two numbers="+(a+b));
}
}
class T1
{
public static void main(String args[])
{
SECOND obj =new SECOND();
obj.show(13,15);
}  
}

