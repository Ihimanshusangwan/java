
class maxSubarraySum {
    public static int maxSum(int array[]){

        //construct prefix sum array which would be our helping array
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i=1;i<array.length;i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int currentSum = prefix[j] - (i > 0 ? prefix[i-1] : 0);
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {12,-2,-3,-44,5,6};
        System.out.println("Maximum subarray sum is " + maxSum(array));
    }

    
}