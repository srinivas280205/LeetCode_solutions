class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: (Optional) Verify candidate
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) {
                freq++;
            }
        }

        return freq > nums.length / 2 ? candidate : -1; // -1 if no majority exists
    }
}
