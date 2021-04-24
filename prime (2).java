import java.util.Scanner;
public class prime
{
 static boolean check_prime(int val)
 {
  int i,flag=0;
  for(i=2;i<=val/2;i++)
  {
   if(val%i==0)
    {
     flag++;
     break;
    }
  }
  if(flag==0)
    return true;
  else
    return false;
 }
 public static void main(String args[])
 {
  int val,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a no to find its nearest prime no:-");
   val=sc.nextInt();
  System.out.println("Here the nearest prime no:-");
  for(j=val+1;;j++)
  {
   if(prime.check_prime(j)==true)
      break;
  }
  System.out.println(j);
 }
}
      

    

