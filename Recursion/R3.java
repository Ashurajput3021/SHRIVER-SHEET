// Print N to 1 Number Using Recursion
import java.util.Scanner;
public class R3 {
    static void printNo(int n){
        if (n==1) {
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printNo(n-1);
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter Any No :");
        n=in.nextInt();
        printNo(n);
        
    }
}
