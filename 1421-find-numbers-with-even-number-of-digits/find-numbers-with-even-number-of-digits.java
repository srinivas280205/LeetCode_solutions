class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int x = num;

            // Count digits by dividing by 10
            while (x > 0) {
                x /= 10;
                digits++;
            }

            // If digit count is even, increment count
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
