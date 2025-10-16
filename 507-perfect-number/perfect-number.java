class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a divisor
        int sqrt = (int)Math.sqrt(num);
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int div = num / i;
                if (div != i) { // avoid adding square root twice
                    sum += div;
                }
            }
        }
        
        return sum == num;
    }
}
