class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        // Try every possible pair (i, j)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // problem guarantees exactly one solution, so this won't be reached
        return new int[] {};
    }
}

        
