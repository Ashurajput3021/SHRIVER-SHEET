// ABCDE
// ABCD 
// ABC  
// AB   
// A
import java.util.Scanner;
public class p15 {
    public static void main(String[]args){
                        char count;
                        for (int i = 'E'; i >='A'; i--) {
                                count='A';
                                for (int j = i; j >='A'; j--) {
                                        System.out.print(count);
                                        count++;
                                }
                                System.out.println();
                        }
                }
}
