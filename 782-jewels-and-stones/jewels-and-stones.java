import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        
        // Add all jewel types to the set
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        
        int count = 0;
        // Count stones that are jewels
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        
        return count;
    }
}
