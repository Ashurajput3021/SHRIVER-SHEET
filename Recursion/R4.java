// Sum of First N number
import java.util.Scanner;
class R4{
    static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter Any Number :");
        n=in.nextInt();
        System.out.println("Sum Of N Number :"+sum(n));
    }
}