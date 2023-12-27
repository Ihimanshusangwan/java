// limitation is when all elements are negative as we are resetting sum to 0 however we can handle that case also by resetting the sum value to minimum value of that array
class kadane {

    public static int maxSubarraySum(int[] array){
        int[] currSumArray = new int[array.length];
        currSumArray[0] = array[0];

        int maxSum = array[0];
        for(int i=1;i<array.length;i++){
            int currentSum = currSumArray[i-1] + array[i];
            currSumArray[i]= (currentSum > 0 )? currentSum: 0;
            maxSum = (currentSum>maxSum)?currentSum:maxSum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {2,-2,-3,-44,5,6};
        System.out.println("Maximum subarray sum is " + maxSubarraySum(array));
    }
    
}
