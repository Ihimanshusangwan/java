public class Triangle {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        int n =5;
        for(int i=1;i<=n;i++){
        for(int j =1;j<=i;j++){
        System.out.print("*");
        }
        System.out.print("\n");
        }

        // inverted
        // *****
        // ****
        // ***
        // **
        // *
        // int n =5;
        for(int i=n;i>0;i--){
        for(int j =1;j<=i;j++){
        System.out.print("*");
        }
        System.out.print("\n");
        }

        // 1
        // 12
        // 123
        // 1234
        // int n =5;
        for(int i=1;i<=n;i++){
        for(int j =1;j<=i;j++){
        System.out.print(j);
        }
        System.out.print("\n");
        }

        // a
        // bc
        // def
        // ghij
        // klmno
        // int n =5;
        char c = 'a';
        for(int i=1;i<=n;i++){
        for(int j =1;j<=i;j++){
        System.out.print(c);
        c++;
        }
        System.out.print("\n");
        }

        // inverted and rotated half pyramid
        //     *
        //    **
        //   ***
        //  ****
        // int n =4;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Floyd's Triangle
        // 1
        // 23
        // 456
        // 78910

        // int n =5;
        int number  = 1;
        for(int i=1;i<=n;i++){
        for(int j =1;j<=i;j++){
        System.out.print( number + " ");
        number++; 
        }
        System.out.print("\n");
        }

        //0-1 Triangle
        // 0
        // 01
        // 010
        // 0101

        // int n =5;
        int num  = 0;
        for(int i=1;i<=n;i++){
        for(int j =1;j<=i;j++){
        System.out.print( num + " ");
        num = (num == 0) ? 1 : 0;
        }
        System.out.print("\n");
        }



    }
}
