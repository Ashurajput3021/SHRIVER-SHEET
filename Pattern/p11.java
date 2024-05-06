// 1    
// 01   
// 101  
// 0101 
// 10101
import java.util.Scanner;
public class p11 {
        public static void main(String[]args){
                int n,sum;
                Scanner in=new Scanner(System.in);
                System.out.print("enter any no :");
                n=in.nextInt();
                for (int i = 1; i <=n; i++) {
                       for (int j = 1; j <=i; j++) {
                         sum = i+j;
                        if (sum % 2==0) {
                                System.out.print("1");
                        } else {
                              System.out.print("0");  
                        }
                       } 
                       System.out.println();
                }
        }
}

