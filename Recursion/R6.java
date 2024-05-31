// Reverse an Array
public class R6 {
   static void rev(int arr[],int index){
      if (index==-1) {
         return;
      }
         System.out.print(arr[index]+" ");
         rev(arr, index-1);
   }
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    rev(arr, 4);
   }

}
