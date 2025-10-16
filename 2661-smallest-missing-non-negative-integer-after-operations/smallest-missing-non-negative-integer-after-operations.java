class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        
        for (int num : nums) {
            int mod = ((num % value) + value) % value;  // handle negatives
            count[mod]++;
        }

        int i = 0;
        while (true) {
            int mod = i % value;
            if (count[mod] == 0) {
                return i;
            }
            count[mod]--;  // use one number of that remainder
            i++;
        }
    }
}
