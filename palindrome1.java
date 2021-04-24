import java.util.Scanner;
public class palindrome
{
 public static void main(String args[])
 {
  String str;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string you want:-");
   str=sc.nextLine();
  char[] ch=str.toCharArray();
  int val=ch.length,flag=0;
  for(int i=0;i<val/2;i++)
  {
   if(ch[i]!=ch[val-1-i])
       flag++;
   else
       flag=0;
   }
   if(flag==0)
   System.out.println("The given string "+str+" is a palindrome string.");
   else
   System.out.println("The given string "+str+" isn't a palindrome string.");
 }
}
