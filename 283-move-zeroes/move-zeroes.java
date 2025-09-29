class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = 0; // pointer for placing non-zeros

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j] if i != j
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
