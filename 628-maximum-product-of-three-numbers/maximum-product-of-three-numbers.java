public class Solution {
    public int maximumProduct(int[] nums) {
        // Initialize variables for top 3 largest and bottom 2 smallest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            // Update the largest three
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            // Update the smallest two
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        // The maximum product is either:
        // 1. The product of the three largest numbers
        // 2. The product of the two smallest (negative) numbers and the largest number
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
