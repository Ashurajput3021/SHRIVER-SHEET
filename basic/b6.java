// Print all Divisors
import java.util.Scanner;
class b6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.print("Enter any Number :");
        n=in.nextInt();
        System.out.print("The divisors of "+n+" are ");
        for ( i = 1; i <=n; i++) {
            if (n%i==0) {
                
                System.out.print(i+",");
            }
        }
    }
}
