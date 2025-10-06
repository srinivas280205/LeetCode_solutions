public class Solution {
    // Reverse bits of a 32-bit unsigned integer
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Take the last bit of n
            int bit = n & 1;

            // Add it to result
            result = (result << 1) | bit;

            // Shift n to the right
            n >>>= 1; // unsigned right shift
        }

        return result;
    }
}
