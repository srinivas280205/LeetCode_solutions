class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int result = 0;

        // Brute-force: try all numbers from 1 up to x/2
        for (int i = 1; i <= x / 2; i++) {
            if ((long)i * i == x) { // perfect square
                return i;
            } else if ((long)i * i > x) { // exceeded x
                return i - 1; // previous number is the sqrt rounded down
            }
            result = i;
        }

        return result;
    }
}
