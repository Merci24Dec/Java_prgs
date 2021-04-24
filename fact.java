import java.util.Scanner;
public class fact
{
 static int factorial(int val)
 {
  if(val!=1)
    return val*factorial(val-1);
  else
    return val;
 }
 public static void main(String args[])
 {
  int val;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a no to find its factorial:-");
   val=sc.nextInt();
  System.out.println("Factorial is "+fact.factorial(val));
 }
}
