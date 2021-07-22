import java.util.Scanner;
class Main{  
  static int factorial(int n){    
    if (n == 0)    
       return 1;    
    else    
       return(n * factorial(n-1));    
  }    
  public static void main(String args[]){ 
  Scanner in = new Scanner(System.in); 
    int i, fact = 1;  
    int number = in.nextInt();
    fact = factorial(number);   
    System.out.println("Factorial of "+number+" is: "+fact);    
  }  
}
//o/p
/*
5

Factorial of 5 is: 120
*/
