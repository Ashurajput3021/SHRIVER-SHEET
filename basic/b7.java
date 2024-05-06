// Check for Prime
import java.util.Scanner;
class b7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter any Number :");
        n=in.nextInt();
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
