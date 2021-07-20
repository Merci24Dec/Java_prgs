import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int num, a = 0, b = 1, c;
     Scanner in = new Scanner (System.in);
     System.out.print ("Enter a number:\n");
     num = in.nextInt ();
     System.out.print ("The fibonaccci series is :\n");
    for (int i = 0; i < num; i++)
      {
	System.out.println (a + "");
	c = a + b;
	a = b;
	b = c;
}}}
//o/p
/*
Enter a number:

5

The fibonaccci series is :

0

1

1

2

3

*/
