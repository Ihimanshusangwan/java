public class hollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            for( j=1 ; j <= n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
