class selectionSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for ( int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j; 
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = { 1, 1, 4, 7, 1, 6 };
        sort(array);
        print(array);
    }

}
