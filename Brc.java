import java.io.*;
class Brc
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a integer value:- ");
int i=Integer.parseInt(br.readLine());
System.out.println("Enter a double value:- ");
double d=Double.parseDouble(br.readLine());
System.out.println("Enter a string value:- ");
String s=br.readLine();
System.out.println("The Integer value is:- "+i);
System.out.println("The Double value is:- "+d);
System.out.println("The String value is :- "+s);
}
}
