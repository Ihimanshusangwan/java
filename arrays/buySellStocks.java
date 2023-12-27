class buySellStocks {
    public static int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyprice<prices[i]){ // profit can be made
               int profit = prices[i]-buyprice;
               maxProfit = Math.max(maxProfit,profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] array = {5,6,3,7,4,9};
        System.out.println("Maximum Profit: " + maxProfit(array));
    }
}
