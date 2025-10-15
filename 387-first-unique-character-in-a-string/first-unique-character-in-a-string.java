class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // store frequency of each letter
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; // no unique character found
    }
}
