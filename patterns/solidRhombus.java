public class solidRhombus {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            for( j=0 ; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
