//Program to implement the Scanner class and accept int,string and double value
import java.util.Scanner;
public class scanner_class
{
 public static void main(String args[])
 {
  Scanner sh=new Scanner(System.in);
  int x;
  double y;
  String z;
  System.out.println("Enter an string value:-"); 
   z=sh.nextLine(); //Takes an string value
  System.out.println("The given string value is "+z);
  System.out.println("Enter an integer value:-");
   x=sh.nextInt(); //Takes integer as input
  System.out.println("The given integer value is "+x); 
  System.out.println("Enter an double value:-");
   y=sh.nextDouble(); //Takes double value
  System.out.println("The given double value is "+y);
 }
}

  
