class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0]; // Minimum price seen so far
        int maxProfit = 0;        // Maximum profit

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price
            minPrice = Math.min(minPrice, prices[i]);
            
            // Update the maximum profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
