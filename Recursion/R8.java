// Fibonacci Number
import java.util.Scanner;
public class R8 {
    static int fib(int n){
        if (n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter anmy no1:");
        n=in.nextInt();
        System.out.println(fib(n));
    }
}
