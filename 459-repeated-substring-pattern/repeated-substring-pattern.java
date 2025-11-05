class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n]; // Longest Prefix Suffix array
        int len = 0, i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        int lastLPS = lps[n - 1];
        return lastLPS > 0 && n % (n - lastLPS) == 0;
    }
}
