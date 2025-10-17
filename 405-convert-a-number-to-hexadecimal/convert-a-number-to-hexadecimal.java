class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        long n = num;
        if (n < 0) {
            n += (1L << 32); // handle negative numbers
        }

        while (n > 0) {
            int digit = (int)(n % 16);
            sb.append(hex[digit]);
            n /= 16;
        }

        return sb.reverse().toString();
    }
}
