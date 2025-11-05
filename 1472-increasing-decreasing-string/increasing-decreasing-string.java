class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        int remaining = s.length();

        while (remaining > 0) {
            // Step 1: Pick characters in increasing order
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    result.append((char) (i + 'a'));
                    count[i]--;
                    remaining--;
                }
            }
            // Step 2: Pick characters in decreasing order
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    result.append((char) (i + 'a'));
                    count[i]--;
                    remaining--;
                }
            }
        }

        return result.toString();
    }
}
