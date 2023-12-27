public class rainwaterTrapping {
    public static int trappedWater(int[] array){
        //left maximum values array
        int[] leftMax = new int[array.length];
        leftMax[0] = array[0];
        for(int i=1;i<array.length;i++){
            leftMax[i]= Math.max(leftMax[i-1], array[i]);
        }
        //right maximum values array
        int[] rightMax = new int[array.length];
        rightMax[array.length -1] = array[array.length-1];
        for (int i=array.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],array[i]);
        }

        int sum =0;
        //calculating the amount of water that can be stored for each element 

        for(int i = 0;i<array.length; i++){
            sum += (Math.min(leftMax[i],rightMax[i])) - array[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] array = {2,4,2,3,6,7,5,9};
        System.out.println("The total amount of water Trapped is "+trappedWater(array));
        
    }
}
