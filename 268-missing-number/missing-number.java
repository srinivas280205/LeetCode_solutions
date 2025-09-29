class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Check each number from 0 to n
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            
            // Look for i in the array
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            
            // If i is not found, it's the missing number
            if (!found) {
                return i;
            }
        }
        
        return -1; // This will never happen according to the problem constraints
    }
}
