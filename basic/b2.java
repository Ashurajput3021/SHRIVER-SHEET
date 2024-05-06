// Reverse a Number
import java.util.Scanner;
public class b2 {
    public static void main (String[] args){
         Scanner in=new Scanner(System.in); 
         int n,r;
         System.out.print("enter the value :"); 
         n= in.nextInt();
         while(n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        
        }
    }
}

