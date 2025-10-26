class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenations are compatible
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of the two lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // The common divisor string
        return str1.substring(0, gcdLength);
    }

    // Helper to compute GCD (Euclidean algorithm)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
