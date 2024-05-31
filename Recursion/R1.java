// Print Name N Times Using Recursion
import java.util.Scanner;

class R1 {
    static void printNo(int n){
        if (n==1) {
            System.out.println("Ashu");
            return;
        }
        printNo(n-1);
        System.out.println("Ashu");
    }
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter Any No :");
    n=in.nextInt();
    printNo(n);
  }
}
