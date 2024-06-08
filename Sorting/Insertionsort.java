public class Insertionsort {
    public static void arrprint(int arr[]){
        System.out.print("After Insertion sort :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        System.out.print("Before Insertion sort :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            // placement
            arr[j+1]=current;
        }
        arrprint(arr);
    }
}
