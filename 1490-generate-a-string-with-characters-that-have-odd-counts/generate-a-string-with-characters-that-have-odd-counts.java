class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        
        if (n % 2 == 0) {
            // even n → (n-1) times 'a' and 1 time 'b'
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        } else {
            // odd n → all 'a'
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        }
        
        return sb.toString();
    }
}
