class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Convert to long and work with absolute values
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int result = 0;
        
        while (a >= b) {
            long temp = b, multiple = 1;
            
            // Double temp until it's just <= a
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            a -= temp;
            result += multiple;
        }
        
        return negative ? -result : result;
    }
}
