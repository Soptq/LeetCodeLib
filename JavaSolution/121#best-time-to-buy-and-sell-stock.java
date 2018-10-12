class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1;i < prices.length;i++) {
        	for (int j = 0;j < i;j++) {
        		if (prices[j] < prices[i] && (prices[i] - prices[j]) > profit) {
        			profit = prices[i] - prices[j];
        		}
        	}
        }
        return profit;
    }
}


public int maxProfit(int[] prices) {
    int lowestPrice = Integer.MAX_VALUE;
    int maxDifference = 0;
    
    for (int price : prices) {
    	//找 `price` 前面的最小 `price`;
        lowestPrice = Math.min(lowestPrice, price);
        //与当前 `price` 做比较相减得 `maxProfit`.
        maxDifference = Math.max(maxDifference, price - lowestPrice);
    }
    
    return maxDifference;
}