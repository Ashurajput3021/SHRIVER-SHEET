// Factorial of N number
import java.util.Scanner;
class R5{
    static int fact(int n){
        if (n==0) {
            return 1;
        }
      return  n*fact(n-1);
    }
    public static void main(String[]args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        n=in.nextInt();
        if (n<0) {
            System.out.println("Factorial is not possible");
            return;
        }
        System.out.println(fact(n));   
    }
}
