import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Step 1: Put banned words in a set for fast lookup
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // Step 2: Use a HashMap to count word frequencies
        Map<String, Integer> freq = new HashMap<>();

        // Step 3: Normalize paragraph: lowercase + remove punctuation
        String[] words = paragraph.toLowerCase()
                                  .replaceAll("[^a-z]", " ")  // replace punctuation with spaces
                                  .split("\\s+");              // split on one or more spaces

        // Step 4: Count occurrences of non-banned words
        for (String word : words) {
            if (word.length() == 0 || bannedSet.contains(word)) continue;
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Step 5: Find the word with the highest frequency
        String mostCommon = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }
}
