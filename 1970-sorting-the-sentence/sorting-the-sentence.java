class Solution {
    /**
     * Sorts a sentence where each word contains its 1-based index at the end.
     * Example: "is2 sentence4 This1 a3" -> "This is a sentence"
     */
    public String sortSentence(String s) {
        // 1. Split the sentence into individual words based on spaces.
        String[] words = s.split(" ");

        // 2. Create a String array to store the words in their correct order.
        //    The array size is the number of words.
        String[] result = new String[words.length];

        // 3. Iterate through each scrambled word to place it correctly.
        for (String word : words) {
            // Get the last character, which is the 1-based index.
            // Example: For "This1", positionChar is '1'.
            char positionChar = word.charAt(word.length() - 1);
            
            // Convert the character digit to a 0-based array index.
            // '1' - '0' = 1. Then 1 - 1 = 0 (the correct index).
            // '4' - '0' = 4. Then 4 - 1 = 3 (the correct index).
            int position = positionChar - '0' - 1;

            // Get the actual word by excluding the last character (the index).
            // Example: For "This1", actualWord is "This".
            String actualWord = word.substring(0, word.length() - 1);

            // Place the word into its correct position.
            result[position] = actualWord;
        }

        // 4. Use a StringBuilder to efficiently join the words with spaces.
        StringBuilder sortedSentence = new StringBuilder();
        
        for (int i = 0; i < result.length; i++) {
            sortedSentence.append(result[i]);
            
            // Append a space after every word except the last one.
            if (i < result.length - 1) {
                sortedSentence.append(" ");
            }
        }

        return sortedSentence.toString();
    }
}