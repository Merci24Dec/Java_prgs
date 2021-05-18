import java.util.Scanner;
 
public class AutomorphicNumberUsingString {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
 
        boolean isAutomorphicNumber = isAutomorphicNumberUsingString(n);
        if(isAutomorphicNumber)
        {
            System.out.println(n +" is automorphic number");
        }
        else
        {
            System.out.println(n +" is not automorphic number");
        }
    }
 
    // Check automorphic number using String
    public static boolean isAutomorphicNumberUsingString(int n) {
 
        // convert numbers to string
        String numStr = Integer.toString(n);
        String sqrNumStr = Integer.toString(n*n);
        System.out.println("Square of n is: "+sqrNumStr);
        // check endWith
        if(sqrNumStr.endsWith(numStr))
            return true;
 
        return false;
    }
}
