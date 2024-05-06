// GCD Or HCF
import java.util.Scanner;
class b4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter 1st No :");
        int a=in.nextInt();
        System.out.print("Enter 2nd No :");
        int b=in.nextInt();
        int g=0;
        for (int i = 1; i <=a; i++) {
            if (a%i==0&&b%1==0) {
                g=i;
            }
        }
        System.out.println("GCD ="+g);
    }
}
