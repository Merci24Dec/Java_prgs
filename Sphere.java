import java.io.*;
class Sphere
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
double r;
System.out.println("Enter the radius of a sphere");
r=Double.parseDouble(br.readLine());
double vol=(4/3)*3.141*(r*r*r);
System.out.println("Volume of the sphere is="+vol);
}
}

