class spiral {
    public static void spiralPrint(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // print top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // print right col
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // print bottom row
            for (int i = endCol-1; i >= startCol && startRow < endRow; i--) {
                System.out.print(arr[endRow][i] + " ");
            }
            // print left col
            for (int i = endRow-1; i > startRow && startCol < endCol; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 5},
                         {2, 3, 4, 6},
                         {1, 5, 9, 7}};
        System.out.print("Spiral Traversal of the given matrix is:");
        spiralPrint(array);

    }

}
