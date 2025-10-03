class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        char[] res = new char[Math.max(a.length(), b.length()) + 1];
        int k = res.length - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            res[k--] = (char) ((sum % 2) + '0');
            carry = sum / 2;
        }
        
        // If res[0] is '\0', skip it
        return new String(res, k + 1, res.length - k - 1);
    }
}
