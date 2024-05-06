// program 6....
// 12345
// 1234 
// 123  
// 12   
// 1
import java.util.Scanner;
class p6 {
            public static void main(String[]args){
                int n,count;
                Scanner in=new Scanner(System.in);
                System.out.print("enter any no :");
                n=in.nextInt();
                for (int i = n; i >=1; i--) {
                        count=1;
                        for (int j = i; j >=1; j--) {
                               System.out.print(count); 
                               count++;
                        }
                        System.out.print("\n");
                }
        }
}    

