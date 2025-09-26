class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for next position of non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move non-val element to position k
                k++;
            }
        }

        return k; // number of elements not equal to val
    }
}
