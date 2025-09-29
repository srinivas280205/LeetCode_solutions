class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String w1 = words[i];

            // Check previous mappings
            for (int j = 0; j < i; j++) {
                char c2 = pattern.charAt(j);
                String w2 = words[j];

                // If letters are the same, words must match
                if (c1 == c2 && !w1.equals(w2)) {
                    return false;
                }
                // If words are the same, letters must match
                if (w1.equals(w2) && c1 != c2) {
                    return false;
                }
            }
        }

        return true;
    }
}
