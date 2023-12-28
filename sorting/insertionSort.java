class insertionSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++){
            int j = i - 1;
            int current = arr[i];
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
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
