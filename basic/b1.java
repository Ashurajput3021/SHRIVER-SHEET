// Count Digits
import java.util.Scanner;
class b1{
    public static void main(String[] args) {
        int n,count=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter any Number :");
        n=in.nextInt();
        while (n>0) {
            n=n/10;
            count++;
        }
        System.out.println("No of Digit :"+count);
    }
}