import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int inputNumber = sc.nextInt();
  int copyOfInputNumber = inputNumber;
  String binary = "";
  int rem = 0;
  while (inputNumber > 0)
  {
   rem = inputNumber % 2;
   binary = rem + binary;
   inputNumber = inputNumber/2;
  }
  System.out.println("Binary Equivalent is: "+binary);
 }
}
//o/p
/*
151

Binary Equivalent is: 10010111
*/
