import java.util.Scanner;
import java.lang.Math;
public class Main
{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                double a = 95.0;
                double b = 20.5;
                System.out.printf("%.1f",a);
                for(int i=2; i<=num; i++) {
                    a = a + b;
                    b = b + 2;
                    System.out.printf(" %.1f",a);
                }
        }
}
//o/p
/*
5

95.0 115.5 138.0 162.5 189.0
*/
