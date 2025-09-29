class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1]; // to mark numbers from 0 to n
        
        // Mark all numbers that appear in the array
        for (int num : nums) {
            seen[num] = true;
        }
        
        // The number that is not seen is the missing number
        for (int i = 0; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        
        return -1; // This won't happen according to the problem constraints
    }
}
