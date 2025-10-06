class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers are positive only

        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
