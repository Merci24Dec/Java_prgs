import java.util.Scanner;
public class Sphere
{
 public static void main(String args[])
 {
  double r;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter radius of the sphere:-");
   r=sc.nextInt();
  double vol=(4/3)*3.141*(r*r*r);
  System.out.println("Volume of the sphere is "+vol);
 }
}
