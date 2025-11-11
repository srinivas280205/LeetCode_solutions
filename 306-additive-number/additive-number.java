import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                String a = num.substring(0, i);
                String b = num.substring(i, j);

                // Leading zero check
                if ((a.length() > 1 && a.charAt(0) == '0') ||
                    (b.length() > 1 && b.charAt(0) == '0')) {
                    continue;
                }

                BigInteger x = new BigInteger(a);
                BigInteger y = new BigInteger(b);

                int k = j;

                while (k < n) {
                    BigInteger z = x.add(y);
                    String zStr = z.toString();

                    // Check if the next number in the string starts with this sum
                    if (!num.startsWith(zStr, k)) {
                        break;
                    }

                    k += zStr.length();
                    x = y;
                    y = z;
                }

                if (k == n) return true;
            }
        }

        return false;
    }
}
