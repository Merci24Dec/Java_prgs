import java.util.Scanner;
import java.lang.Math;
public class Main
{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                int a = 462;
                int b = 42;
                System.out.print(a);
                for(int i=2; i<=num; i++) {
                    a = a - b;
                    b = b - 2;
                    System.out.print(" "+a);
                }
        }
}
//o/p
/*
5

462 420 380 342 306
*/
