// Check Palindrome
import java.util.Scanner;
 class b3 {
      public static void main(String[] args){
        Scanner in= new Scanner(System.in); 
         int n,s=0,c,r;
        System.out.print("enter the value :");
          n=in.nextInt();
          c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
            }
             if (c==s) {
                System.out.println("pilndrome numbar");
                
             } else {
                System.out.println("not plindrome number");
             }
         in.close();
    }
}

