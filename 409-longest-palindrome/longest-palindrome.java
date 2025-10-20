class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII range (covers all letters)
        
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int freq : count) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1; // use the even part
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1; // one odd character can go in the center

        return length;
    }
}
