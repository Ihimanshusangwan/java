class diagonalSum {
    public static int sum(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal using relation i + j = n-1
            if(i != n-i-1){ // avoiding the inclusion of overlaping element of primary and secondary diagonal
                sum += matrix[i][n - i - 1];
            }  
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                         {2, 3, 4},
                         {1, 5, 9}};
        System.out.println("The sum of elements in the diagonal is: " + sum(array));
        
    }

    
}