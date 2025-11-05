class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            // Skip non-letter characters from the left
            if (!Character.isLetter(chars[i])) {
                i++;
            }
            // Skip non-letter characters from the right
            else if (!Character.isLetter(chars[j])) {
                j--;
            }
            // Both are letters -> swap
            else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }
}
