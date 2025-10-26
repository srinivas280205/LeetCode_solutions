class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            // If left is even, it’s in the correct place
            if (nums[left] % 2 == 0) {
                left++;
            } 
            // If right is odd, it’s in the correct place
            else if (nums[right] % 2 == 1) {
                right--;
            } 
            // Swap when left is odd and right is even
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}
