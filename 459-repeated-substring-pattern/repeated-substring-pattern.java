class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Double the string and remove the first and last character
        String doubled = s + s;
        // If s exists inside doubled (excluding first and last char), it's a repeat
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}
