import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count how many times each number appears
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if all occurrence counts are unique
        Set<Integer> seen = new HashSet<>();
        for (int freq : count.values()) {
            if (!seen.add(freq)) {
                // If add() returns false → duplicate frequency found
                return false;
            }
        }

        // Step 3: All frequencies are unique
        return true;
    }
}
