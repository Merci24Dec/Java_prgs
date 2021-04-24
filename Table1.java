import java.util.Scanner;
public class Table
{
 public static void main(String args[])
 {
  int a,b,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a no to print its multiplication table:-");
   a=sc.nextInt();
  System.out.println("Enter no terms in the multiplication table:-");
   b=sc.nextInt();
  System.out.println("Here the result:-");
  for(i=1;i<=b;i++)
    System.out.println(a+"*"+i+"="+(a*i));
 }
}

  
