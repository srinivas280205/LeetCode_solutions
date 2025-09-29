class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters (strict) and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two-pointer approach on cleaned string to avoid extra reverse string
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
