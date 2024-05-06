// Armstrong Numbers
import java.util.Scanner;
class b5 {
    public static void main(String[] args){
        int n,arm=0,rem,c;
        System.out.print("Enter any Number :");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if (c==arm) {
            System.out.println("Armstrong numbar");
            
        } else {
            System.out.println(" Not Armstrong Number");
        }
    }
}

