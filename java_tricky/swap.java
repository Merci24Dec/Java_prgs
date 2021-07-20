import java.util.Scanner;
 
public class Main {
 public static void main(String args[]) {
       int x, y;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter x and y values :\n");
       x = in.nextInt();
       y = in.nextInt();
       System.out.println("Before Swapping");
  System.out.println(x +"\n" +y);
       x = x + y;
       y = x - y;
      x = x - y;
       System.out.println("After Swapping");
  System.out.println(x +"\n" +y);
   }
}
//o/p
/*
Enter x and y values :

3

4

Before Swapping

3

4

After Swapping

4

3

*/
