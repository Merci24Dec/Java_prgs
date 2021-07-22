import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        int number = obj.nextInt();
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(number == reverse)
            System.out.println("Number: " + number + " is a palindrome");
        else
            System.out.println("Number: " + number + " is not a palindrome");
    }

}
//o/p
/*
1221

Number: 1221 is a palindrome
*/
