import java.io.*;
class Table
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a value to print its multiplication table:- ");
double n=Double.parseDouble(br.readLine());
System.out.println("Enter a value for number of terms in the multiplication table:- ");
int s=Integer.parseInt(br.readLine());

System.out.println("Here is the result:- ");
for(int i=1;i<=s;i++)
System.out.println(n+"*"+i+"="+(n*i));
}
}
