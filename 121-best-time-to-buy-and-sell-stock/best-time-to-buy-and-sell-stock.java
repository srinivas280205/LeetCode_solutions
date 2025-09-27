class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Profit if selling today
            int profit = prices[i] - minPrice;
            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
