import java.util.Scanner;
import java.util.Arrays;
public class Main {
 public static void main(String[] args) 
 { 
  Scanner in = new Scanner(System.in);
  String s1 = in.next();
  String s2 = in.next();
  s1 = s1 + s2;
  s2 = s1.substring(0, s1.length()-s2.length());
  s1 = s1.substring(s2.length());
  System.out.println("After Swapping :");
  System.out.println(s1);
  System.out.println(s2);
 } 
}
//o/p
/*
341

21

After Swapping :

21

341
*/
