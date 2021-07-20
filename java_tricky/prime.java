import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  int temp, num;
  boolean isPrime = true;
  Scanner in = new Scanner(System.in);
     System.out.print("Enter a number:\n");
  num = in.nextInt();
  for (int i = 2; i<= num/2; i++)
  {
   temp = num%i;
   if (temp == 0) 
   { isPrime = false;
    break;
                  }
  }
  if(isPrime==true) 
   System.out.println(num +" number is prime");
  else 
   System.out.println(num +" number is not a prime");
}
}
//o/p
/*
Enter a number:

451

451 number is not a prime

*/
