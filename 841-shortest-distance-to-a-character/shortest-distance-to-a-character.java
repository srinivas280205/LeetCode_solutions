class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int prev = Integer.MIN_VALUE / 2; // use a large negative value
        
        // First pass: left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            res[i] = i - prev;
        }
        
        // Second pass: right to left
        prev = Integer.MAX_VALUE / 2; // large positive value
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            res[i] = Math.min(res[i], prev - i);
        }
        
        return res;
    }
}
