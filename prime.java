//Program to check whether a given no is prime or not
import java.util.Scanner;
public class prime
{
 public static void main(String args[])
 {
  int val,i,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a no to check whether it's prime or not:-");
   val=sc.nextInt();
  for(i=2;i<=val/2;i++)
  {
   if(val%i==0) //Check whether the value is prime or not
    {
     flag++; //If not the terminate from the loop
     break;
    }
  }
  if(flag==0)
     System.out.println(val+" is a prime number");
  else
     System.out.println(val+" isn't a prime number");
 }
}
