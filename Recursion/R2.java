// Print 1 to N Number Using Recursion

import java.util.Scanner;

public class R2 {
    static void printNo(int n){
        if (n==1) {
            System.out.println("1");
            return;
        }
        printNo(n-1);
        System.out.println(n);
    }
 public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter Any No :");
    n=in.nextInt();
    printNo(n);
 }
}
