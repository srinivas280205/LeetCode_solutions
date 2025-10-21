import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Use a HashSet for fast lookup of banned words
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();

        StringBuilder word = new StringBuilder();
        String mostCommon = "";
        int maxCount = 0;

        // Convert to lowercase and append a sentinel punctuation to handle the last word
        paragraph = paragraph.toLowerCase() + ".";

        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                String w = word.toString();
                if (!bannedSet.contains(w)) {
                    int newCount = freq.getOrDefault(w, 0) + 1;
                    freq.put(w, newCount);
                    // Track the most common word inline — avoids a second loop
                    if (newCount > maxCount) {
                        maxCount = newCount;
                        mostCommon = w;
                    }
                }
                word.setLength(0); // clear the StringBuilder
            }
        }

        return mostCommon;
    }
}
