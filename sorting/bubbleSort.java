class bubbleSort {
    public static void sort(int arr[]) {
        boolean swap = false;
        for (int i = 1; i < arr.length ; i++) { // we need to iterate size - 1 times
            for (int j = 0; j < arr.length - i; j++) {//in each iteration only need to check upto size - i(no. of current iteration) index as after that array has been sorted by previous iteration
                if (arr[j] > arr[j+1]) {
                    // swapping
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    // setting the flag true
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
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