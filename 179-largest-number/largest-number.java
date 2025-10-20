import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings for easy comparison
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Custom comparator:
        // Sort by comparing combined strings (b+a vs a+b)
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is "0", the whole number is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the final string
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }
}
