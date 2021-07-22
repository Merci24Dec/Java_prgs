//a program to find largest and second largest element in an array
import java.util.Scanner;
public class Main {
 public static void main(String[] args)
     {
            Scanner in = new Scanner (System.in);
         int l = 0,s = 0,n;
         System.out.print("Enter n value: \n");
  n = in.nextInt();
  int arr[] = new int [n];
  System.out.print("Enter elements: \n");
  
            for (int i = 0; i < n; i++)
            { 
     arr[i] = in.nextInt();
      }

for (int i = 0; i < n; i++)
         {
             if (arr[i] > l)
             { 
                 s = l;
                 l = arr[i];
                 
             }
                  else if(arr[i]>s)
                      s=arr[i];
         }
         System.out.println("Second largest number is: " + s);
         System.out.println("Largest Number is: " +l);
     }
}
//o/p
/*
Enter n value: 

15

Enter elements: 

1

2

3

4

5

6

7

8

9

10

11

12

13

14

15

Second largest number is: 14

Largest Number is: 15

*/
