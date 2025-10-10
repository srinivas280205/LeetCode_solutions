class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; // for 'a' to 'z'

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract for t, find the extra character
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c;
            }
        }
        return ' '; // default (should not reach here)
    }

    // Test example
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "abcde";
        System.out.println("Added character: " + sol.findTheDifference(s, t));
    }
}
