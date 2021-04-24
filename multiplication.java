import java.util.Scanner;
public class multiplication
{
  public static void main(String args[])
  {
    int arr1[][],arr2[][],arr3[][],i,j,k,sum=0;
  Scanner sc=new Scanner(System.in);
  arr1=new int[3][3];
  arr2=new int [3][3];
  System.out.println("Enter elements in 1st matrix:-");
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
     arr1[i][j]=sc.nextInt();
    }
   }
   System.out.println("Enter elements in 2nd matrix:-");
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
     arr2[i][j]=sc.nextInt();
    }
   }
   arr3=new int[3][3];
   for(i=0;i<3;i++)
    {
    for(j=0;j<3;j++)
     {
     for(k=0;k<3;k++)
       {arr3[i][j]+=arr1[i][k]*arr2[k][j];}
     }
    }
   System.out.println("Here the resultant matrix:-");
    for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
       System.out.println(arr3[i][j]);
      }
    }
  }
}
  
