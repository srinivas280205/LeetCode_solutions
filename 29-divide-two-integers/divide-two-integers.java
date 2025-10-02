class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Precompute all doubles of divisor up to dividend
        long[] doubles = new long[32];
        int[] multiples = new int[32];
        int i = 0;

        doubles[i] = b;
        multiples[i] = 1;

        while (doubles[i] <= a - doubles[i]) { // prevent overflow
            doubles[i + 1] = doubles[i] << 1;
            multiples[i + 1] = multiples[i] << 1;
            i++;
        }

        // Work backwards to subtract the largest possible multiples
        for (int j = i; j >= 0; j--) {
            if (a >= doubles[j]) {
                a -= doubles[j];
                result += multiples[j];
            }
        }

        return negative ? -result : result;
    }
}
