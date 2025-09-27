class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // points to last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;           // move to next unique slot
                nums[i] = nums[j]; // place the new unique element
            }
        }

        return i + 1; // number of unique elements
    }
}
