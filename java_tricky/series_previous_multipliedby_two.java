import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n,a=1,b=0,c;
        for(n=1; n<=num; n++)
        {
            c= a + 2*b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
//o/p
/*
5

1 2 5 12 29
*/
