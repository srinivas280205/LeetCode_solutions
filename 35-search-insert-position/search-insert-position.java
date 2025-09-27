class Solution {
    public int searchInsert(int[] nums, int target) {
        // Brute force: linear search
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        // If target is greater than all elements
        return nums.length;
    }
}
