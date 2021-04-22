import java.util.Scanner;
class A
{
int Rollno,age;
}
class B extends A
{
int tm=550;
void show(int x,int y)
{
Rollno=x;
age=y;
System.out.println("Student's Rollno:-\t"+Rollno);
System.out.println("Student's Age:-\t"+age);
System.out.println("Student's Totalmarks=\t"+tm);
}
}
class T2
{
public static void main(String args[])
{
B obj =new B();
obj.show(37,19);
}  
}

