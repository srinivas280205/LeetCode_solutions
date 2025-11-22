import java.util.Arrays;

class Solution {
    /**
     * Calculates the maximum sum obtained by repeatedly deleting the greatest value
     * from each row and adding the maximum of those deleted values to the total.
     * * @param grid The input m x n matrix of integers.
     * @return The maximum score.
     */
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        // The problem guarantees n > 0 if m > 0.
        int n = grid[0].length; 
        
        // 1. Sort each row independently.
        // This is the O(m * n log n) step, which is the bottleneck.
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }
        
        int totalScore = 0;
        
        // 2. Iterate through columns from right to left (k = n - 1 down to 0).
        // The 'k' index represents the 'operation' number:
        // k = n-1 is the first operation, k = 0 is the last operation.
        for (int k = n - 1; k >= 0; k--) {
            int maxInColumn = 0;
            
            // 3. Find the maximum element in the current column (k).
            // This maximum element is the value added to the score in this operation.
            for (int i = 0; i < m; i++) {
                // grid[i][k] is the k-th largest element in row i (0-indexed).
                maxInColumn = Math.max(maxInColumn, grid[i][k]);
            }
            
            // 4. Add the maximum found in this column to the total score.
            totalScore += maxInColumn;
        }
        
        return totalScore;
    }
}