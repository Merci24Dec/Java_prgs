//series program
import java.util.Scanner;
public class Main
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 12;
        int a = 20;
        for(int i=1;i<=n;i++) {
            System.out.print(sum+" ");
            sum = sum+a;
            a=a*2;
        }
    }
} 
//o/p
/*
5

12 32 72 152 312 
*/
