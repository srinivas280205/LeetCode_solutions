class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = 0;

            // Map each Roman numeral to its integer value
            switch (s.charAt(i)) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }

            // If current value is less than previous, subtract it; otherwise add it
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }

            prev = curr; // update previous
        }

        return total;
    }
}
