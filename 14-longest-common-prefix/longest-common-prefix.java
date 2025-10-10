class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take the first string as reference
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    // Test example
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"flower","flow","flight"};
        System.out.println("Longest Common Prefix: " + sol.longestCommonPrefix(words));
    }
}
