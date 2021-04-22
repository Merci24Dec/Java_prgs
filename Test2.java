import java.util.Scanner;
class Student
{
private int rollno;
private int age;
public void input(int a,int b)
{
  rollno=a;
  age=b;
}
void display()
{
System.out.println("Roll no of the student is: "+rollno);
System.out.println("Age of the student is: "+age);
}
}
class Test2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of the student:-");
int age= sc.nextInt();
System.out.println("Enter Rollno of the student:-" );
int rollno=sc.nextInt();
Student obj =new Student();
obj.input(rollno,age);
obj.display();
}  
}