class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if original cleaned string equals reversed string
        return cleaned.equals(reversed);
    }
}
