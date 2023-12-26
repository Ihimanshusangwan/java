public class daimond {
    public static void upperDaimond(int n){
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            for( j=1 ; j < i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void lowerDaimond(int n){
        for(int i = n; i >0; i--){
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            for( j=1 ; j < i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        upperDaimond(4);
        lowerDaimond(4);
    }
}
