class staircaseSeach {
    public static void search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at Matrix[" + row + "][" + col + "]");
                return;
            } else if (matrix[row][col] > key) {
                col--; // move to left
            } else {
                row++;// move down
            }

        }
        System.out.print("Element not present in the array");
        
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 },
                           { 2, 4, 6, 8 },
                           { 9, 10, 11, 16 } };
        int key = 6;
        search(matrix, key);
    }
}
