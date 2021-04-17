import java.io.*;
class A
{
public static void main(String args[])throws IOException
{
byte a,b;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
String s1=br.readLine();
Byte b1=new Byte(s1);
String s2=br.readeadLine();
Byte b2=new Byte(s2);
int R=b1.compareTo(b2);
if(R==0)
{
System.out.println("Both are Same");
}
else
{
System.out.println("They are not same")
}
}
}
