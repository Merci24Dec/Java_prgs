import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String args[]){  
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a[][]=new int[n][m];    
         
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = in.nextInt();
            }
        }
        int n1 = in.nextInt(), m1 = in.nextInt();
        int b[][]=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                b[i][j] = in.nextInt();
            }
        }

 	  if(m!=n1){
            System.out.println("Invalid Matrix Size");
        }
        else {
        int c[][]=new int[n][m1];    
        for(int i=0;i<n;i++){    
            for(int j=0;j<m1;j++){    
                for(int k=0;k<m;k++)      
                    c[i][j]+=a[i][k]*b[k][j];      
                System.out.print(c[i][j]+" ");   
            }  
            System.out.println();    
        } }   
    }
}
//o/p
/*
2

2

2

2

2

2

2

2

2

2

2

2

8 8 

8 8 
*/
