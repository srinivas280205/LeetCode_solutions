class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n]; // Array to hold the shuffled elements
        int i = 0;  // Pointer for the first half (x1, x2, ..., xn)
        int j = n;  // Pointer for the second half (y1, y2, ..., yn)
        int k = 0;  // Pointer for the result array

        while (i < n && j < 2 * n) {
            result[k++] = nums[i++]; // Take element from first half
            result[k++] = nums[j++]; // Take element from second half
        }

        return result;
    }
}
