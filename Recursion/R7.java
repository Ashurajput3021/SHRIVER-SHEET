// Check if a string is palindrome or not
public class R7 {
   static boolean paln(String str,int start,int end){
        if (start>=end) {
            return true;
        }
        if (str.charAt(start)!=str.charAt(end)) {
            return false;
        }else{
            return paln(str, start+1, end-1);
        }

   }
   public static void main(String[] args) {
    String str ="naman";
    System.out.println(paln(str, 0, 4));
   }
}
   
