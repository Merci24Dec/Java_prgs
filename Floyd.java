import java.util.Scanner;
public class Floyd
{
 public static void main(String args[])
 {
  int n,i,j,k=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter of lines in Floyd's triangle:-");
   n=sc.nextInt();
  System.out.println("Here the result:-");
   for(i=0;i<n;i++)
   {
    for(j=0;j<=i;j++)
    {
     System.out.print(k+" ");
      k++;
    }
   System.out.println();
  }a
 }
}
