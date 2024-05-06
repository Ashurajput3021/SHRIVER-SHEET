// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
import java.util.Scanner;
public class p19 { 
       public static void main(String[]args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("enter any no :");
        n=in.nextInt();
        for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=i; j++) {
                     System.out.print("*");   
                }
                for (int j = n-1; j >=i; j--) {
                      System.out.print("  ");  
                }
                for (int j = 1; j <=i; j++) {
                        System.out.print("*");
                }
               System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
               for (int j = i; j >=1; j--) {
                System.out.print("*");
               } 
               for (int j = n-1; j >=i; j--) {
                System.out.print("  ");
               }
               for (int j = i; j >=1; j--) {
                System.out.print("*");
               }
               System.out.println();
        }
       }
}

