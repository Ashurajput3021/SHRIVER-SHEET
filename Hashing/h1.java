//  Count frequency of each element in the array
 class h1 {
    public static void main(String[]args){
        int[] a={10,5,10,15,10,5};
        for (int i = 0; i < a.length; i++) {
            int n=a[i],count=0;
            if (n==-1)continue;
            for (int j = 0; j < a.length; j++) {
                if (a[j]==n) {
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println(n+" Occurs "+count+" time in array");
        }
    }
}
