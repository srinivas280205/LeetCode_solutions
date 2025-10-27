class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store each number and its last seen index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                // Check if the distance between indices is <= k
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            // Update or add the current number's index
            map.put(nums[i], i);
        }
        
        // No duplicates found within distance k
        return false;
    }
}