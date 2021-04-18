import java.io.*;
class Leap
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x;
System.out.println("enter the year to check wheather it is laep year or not  " );
x=Integer.parseInt(br.readLine());
if (x%4==0)
System.out.println("leap year");
else
System.out.println("not leap year");
}
}
