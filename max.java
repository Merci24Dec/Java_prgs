//Program to display the 1-D array and also find the greatest element
import java.util.Scanner;
public class max
{
   static int arr[]; //Global Array Declaration 
 public static void main(String args[])
 {
  int val,i;
  Scanner obj=new Scanner(System.in); /*Scanner class with object name 'obj'.An object is an user defined name.*/
  System.out.println("Enter no of elements:-");
   val=obj.nextInt(); //nextInt is an integer token which assign an integer value to 'val'
   arr=new int[val]; // Array Initialization
  System.out.println("Enter your elements:-");
   for(i=0;i<val;i++)
    {
       arr[i]=obj.nextInt(); //Insertion in Array
    }
   int temp=arr[0];
  for(i=1;i<val;i++)
  {
    if(arr[i]>temp)   //Compare each element in array and assign it to in temp
       temp=arr[i];
  }
  System.out.println("Maximum value in array is "+temp);
  }
}
