public class selectionsort {
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
        // selection short
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]) {
                    smallest=j;
                }
            }
             // swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        arrprint(arr);
    }
}
