// 1      1
// 12    21
// 123  321
// 12344321
import java.util.Scanner;
public class p12 {
        public static void main(String[]args){
                int n;
                Scanner in=new Scanner(System.in);
                System.out.print("enter any no :");
                n=in.nextInt();
                for (int i = 1; i <=n; i++) {
                      for (int j = 1; j <=i; j++) {
                        System.out.print(j);
                      }  
                      for (int j = n-1; j >=i; j--) {
                        System.out.print("  ");
                      }
                      for (int j =i ; j >=1; j--) {
                        System.out.print(j);
                      }
                      System.out.println();
                }
        }
}

