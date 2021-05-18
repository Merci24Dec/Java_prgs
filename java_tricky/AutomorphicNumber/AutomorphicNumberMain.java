import java.util.Scanner;
 
public class AutomorphicNumberMain {
 
    public static void main(String args[]){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
 
        boolean isAutomorphicNumber = isAutomorphicNumber(n);
        if(isAutomorphicNumber)
        {
            System.out.println(n +" is automorphic number");
        }
        else
        {
            System.out.println(n +" is not automorphic number");
        }
    }
 
    private static boolean isAutomorphicNumber(int n) {
        int noOfDigits=0;
        int sqrOfN = n * n;
        System.out.println("Square of n is: "+sqrOfN);
        int temp = n;  //copying num
 
        // count digits of num
        while(temp>0){
            noOfDigits++;
            temp=temp/10;
        }
 
        int lastNDigitsOfSquare = (int) (sqrOfN%(Math.pow(10,noOfDigits)));
 
        if(n == lastNDigitsOfSquare)
            return true;
        else
           return false;
    }
}
