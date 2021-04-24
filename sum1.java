import java.util.Scanner;
public class sum
{
  static int arr[];
 public static void main(String args[])
 {
  int val,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no of elements:-");
   val=sc.nextInt();
   arr=new int[val];
  System.out.println("Enter your elements:-");
   for(i=0;i<val;i++)
   {
    arr[i]=sc.nextInt();
   }
  int sum=0;
  for(i=0;i<val;i++)
  {
   sum+=arr[i];
  }
 System.out.println("Sum of given nos is "+sum);
 }
} 
  
