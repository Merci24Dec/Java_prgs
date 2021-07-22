import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int number , copy, remainder, result = 0, c = 0;
        Scanner obj= new Scanner(System.in);
        number= obj.nextInt();
        copy= number;

       while(copy!=0)
       {
           c++;//to get the count of digits
           copy=copy/10;
       }
        copy= number;
       while(copy != 0)
        {
            remainder = copy % 10;
            result += Math.pow(remainder, c);
            copy= copy/10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
//o/p
/*
153

153 is an Armstrong number.

*/
