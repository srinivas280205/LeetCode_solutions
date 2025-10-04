class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // already satisfies condition

        int i = 2; // write index, start from 2
        for (int j = 2; j < n; j++) {
            // Only write nums[j] if it's not the same as nums[i-2]
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

