class Sample
{
int x,y,p,q,r;
void Add(int a,int b)
{
x=a;
y=b;
System.out.println("Sum of two numbers="+(x+y));
}
void Add(int a,int b,int c)
{
p=a;
q=b;
r=c;
System.out.println("Sum of two numbers="+(p+q+r));
}
}
class T5
{
public static void main(String args[])
{
Sample obj =new Sample();
obj.Add(10,20);
obj.Add(1,2,3);
}  
}

