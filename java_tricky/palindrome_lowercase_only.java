import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a string: \n");
  String a=sc.next();
  int n=a.length();
  int flag=0;
  for(int i=0;i<n/2;i++)
   {
          if(a.charAt(i)!=a.charAt(n-i-1))
          { flag=1; break;}
          
   }
if (flag==0)
      System.out.println("The string is palindrome");
   else
      System.out.println("The string is not palindrome");
 }
}
//o/p
/*
Enter a string: 

madam

The string is palindrome

*/
