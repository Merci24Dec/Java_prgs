//Program to check whether the given value is armstrong or not
import java.util.Scanner;
public class armstrong
{
 public static void main(String args[])
 {
  int val;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a value to check whether it's armstrong or not:-");
   val=sc.nextInt();
  int rem,sum=0,temp=val;
  while(temp!=0)
  {
    rem=temp%10;
    sum+=rem*rem*rem; //Use of assignment operator.
    temp/=10;
  }
  if(sum==val)
     System.out.println(val+" is an armstrong no");
  else
     System.out.println(val+" isn't an armstrong no");
 }
}
