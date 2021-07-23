import java.util.Scanner;
public class Main
{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = 20;
            int i = 0;
            while(n>0){
                a = a - i;
                System.out.print(a +" ");
                i++;
                n--;
            }
        }
}
//o/p
/*5

20 19 17 14 10 
*/
