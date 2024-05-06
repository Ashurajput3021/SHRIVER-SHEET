// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10       
// 11 12 13 14 15
import java.util.Scanner;
public class p13 {
        public static void main(String[]args){
                int n,count=1;
                Scanner in=new Scanner(System.in);
                System.out.print("enter any no :");
                n=in.nextInt();
                for (int i = 1; i <=n; i++) {
                      for (int j = 1; j <=i; j++) {
                        System.out.print(count+" ");
                        count++;
                      }  
                      System.out.println();
                }
        }
}

