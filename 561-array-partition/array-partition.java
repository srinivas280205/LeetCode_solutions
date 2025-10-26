import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int sum = 0;

        // Step 2: Add every 2nd element (the smaller one in each pair)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
