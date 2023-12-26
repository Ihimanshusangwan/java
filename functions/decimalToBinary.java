
public class decimalToBinary {
    public static int decToBin(int decNum){
    int ans = 0;
    int i = 1;
    while(decNum > 0){
        int r = decNum % 2;
        ans += (r * i);
        i *= 10;
        decNum/= 2;
    }
    return ans;
    }
public static void main(String[] args) {
  System.out.println(decToBin(100));
}
    
}