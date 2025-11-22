import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    /**
     * Finds all unique 3-digit even numbers that can be formed by 
     * concatenating three elements from the given 'digits' array.
     */
    public int[] findEvenNumbers(int[] digits) {
        // 1. Count the frequency of each digit.
        int[] counts = new int[10];
        for (int d : digits) {
            counts[d]++;
        }

        Set<Integer> validNumbers = new HashSet<>();

        // 2. Iterate through all possible 3-digit even numbers (100 to 998, step 2).
        for (int num = 100; num <= 998; num += 2) {
            
            // Get the digits of the current number (hundreds, tens, ones).
            int c = num % 10;          // Ones digit
            int b = (num / 10) % 10;   // Tens digit
            int a = num / 100;         // Hundreds digit

            // Create a temporary count array for the number's digits
            int[] tempCounts = new int[10];
            tempCounts[a]++;
            tempCounts[b]++;
            tempCounts[c]++;

            // 3. Check if the required digits are available in the input array.
            boolean possible = true;
            if (tempCounts[a] > counts[a]) possible = false;
            if (possible && tempCounts[b] > counts[b]) possible = false;
            if (possible && tempCounts[c] > counts[c]) possible = false;

            if (possible) {
                validNumbers.add(num);
            }
        }

        // 4. Convert the set of valid numbers to a sorted array.
        List<Integer> sortedList = new ArrayList<>(validNumbers);
        Collections.sort(sortedList);
        
        int[] result = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            result[i] = sortedList.get(i);
        }

        return result;
    }
}