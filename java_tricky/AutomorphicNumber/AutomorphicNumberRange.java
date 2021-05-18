import java.util.Scanner;
 
public class AutomorphicNumberRange {
 
    public static void main(String[] args) {
        int min = 0, max = 0;
 
        Scanner scanner = new Scanner(System.in);
 
        // Get min and max values
        System.out.print("Enter minimum range: ");
        min = scanner.nextInt();
        System.out.print("Enter maximum range ");
        max = scanner.nextInt();
 
        // check number
        System.out.println("The Automorphic numbers from "+
                min+" to "+ max+" are: ");
 
        for(int i=min; i<=max; i++) {
            if(isAutomorphicNumber(i))
                System.out.print(i+" ");
        }
 
        // close Scanner class object
        scanner.close();
    }
 
    private static boolean isAutomorphicNumber(int n) {
        int noOfDigits=0;
        int sqrOfN = n * n;
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
