// program 8....
//   **********
//    ******* 
//     *****  
//      ***   
//       *
import java.util.Scanner;
public class p8 {
        public static void main(String[]args){
             int n;
             Scanner in=new Scanner(System.in);
             System.out.print("enter any no :");
             n=in.nextInt();
             for (int i = n; i >=1; i--) {
                for (int j = i; j <=n-1; j++) {
                     System.out.print(" ");   
                }
               for (int j = i*2-1; j >=1; j--) {
                System.out.print("*");
               }
               System.out.println();
             }
        }
}

