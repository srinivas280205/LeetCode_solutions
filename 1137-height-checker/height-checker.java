import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Step 1: Copy the original array
        int[] expected = heights.clone();

        // Step 2: Sort the copy
        Arrays.sort(expected);

        // Step 3: Count mismatched positions
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        // Step 4: Return the count
        return count;
    }
}
