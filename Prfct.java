import java.io.*;
class Prfct
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int s=0,x,i;
System.out.println("Enter a value to check whether it is perfect or not");
x=Integer.parseInt(br.readLine());
x=s;
for(i=1;i<x;i++)
{
if(i%x==0)
{
s=s+i;
}
}
if(s==x)
{
System.out.println("This is a perfect number");
}
else
{
System.out.println("This is not a perfect number");
}
}
}
