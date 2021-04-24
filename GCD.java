import java.util.Scanner;
public class GCD
{
 public static void main(String args[])
 {
  int n1,n2;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two numbers:-");
   n1=sc.nextInt();
   n2=sc.nextInt();
  n1=(n1>0)?n1:-n1;
  n2=(n2>0)?n2:-n2;
  int a=n1,b=n2;
  while(b!=0)
  {
   int t=b;
       b=a%b;
       a=t;
  }
  int gcd=a,lcm=(n1*n2)/gcd;
  System.out.println("Here the GCD is "+gcd+" & LCM is "+lcm);
 }
} 

