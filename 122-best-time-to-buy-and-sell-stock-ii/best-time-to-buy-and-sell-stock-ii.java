class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit = 0;

        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxprofit += arr[i] - arr[i - 1];
            } 
        }

        return maxprofit;
        
    }

}
