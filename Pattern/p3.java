// 1
// 12
// 123
// 1234
// 12345
import java.util.Scanner;
class p3 {
        public static void main(String[]args){
                int n;
                Scanner in=new Scanner(System.in);
                System.out.print("enter any no :");
                n=in.nextInt();
                for (int i = 1; i <=n; i++) {
                        for (int j = 1; j <=i; j++) {
                             System.out.print(j);   
                        }
                        System.out.print("\n");
                }
        }
}

