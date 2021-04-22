class ONE
{
int i=10;
void show()
{
System.out.println(i);
}
}
class TWO extends ONE
{
int i=20;
void show()
{
System.out.println(i);
System.out.println(super.i);
}
}
class T3
{
public static void main(String args[])
{
TWO obj =new TWO();
obj.show();
}  
}

