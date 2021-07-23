import java.util.Scanner;
public class Main{
    public static void main(String args[]){
   int n = new Scanner(System.in).nextInt(); int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = (i%2==1) ? (i*i)-1 : (i*i)-2 ; 
       System.out.print(sum+ " ");
        }
    }
} 
//o/p
/*
5

0 2 8 14 24 
*/
