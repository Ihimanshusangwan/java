public class Butterfly {
    public static void upperButterfly(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= 2*n; j++){
                if(j <= i || j > 2*n - i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void lowerButterfly(int n){
        for(int i = n ; i > 0; i--){
            for(int j = 1; j <= 2*n; j++){
                if(j <= i || j > 2*n - i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        upperButterfly(n);
        lowerButterfly(n);
    }
    public static void main(String[] args) { 
        butterfly(5);
    }
    
}
