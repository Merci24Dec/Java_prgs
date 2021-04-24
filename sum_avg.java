//Program tp find the sum and average of 5 numbers
import java.util.Scanner;
public class sum_avg
{
 public static void main(String args[])
 {
   int arr[],sum=0,avg,i;
   Scanner sc=new Scanner(System.in);
   arr=new int[5];
   System.out.println("Enter 5 numbers:-");
    for(i=0;i<5;i++)
    {
     arr[i]=sc.nextInt();
    }
   for(i=0;i<5;i++)
   {
    sum+=arr[i];  //Count the sum
   }
   System.out.println("Sum of 5 elements is "+sum);
   avg=sum/5; //Count the average
   System.out.println("Average of 5 elements is "+avg);
  }
}

