import java.util.*;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> sumQueue = new LinkedList<>();

        nodeQueue.offer(root);
        sumQueue.offer(root.val);

        while (!nodeQueue.isEmpty()) {
            TreeNode current = nodeQueue.poll();
            int currentSum = sumQueue.poll();

            // Check if it's a leaf with a matching sum
            if (current.left == null && current.right == null && currentSum == targetSum) {
                return true;
            }

            if (current.left != null) {
                nodeQueue.offer(current.left);
                sumQueue.offer(currentSum + current.left.val);
            }
            if (current.right != null) {
                nodeQueue.offer(current.right);
                sumQueue.offer(currentSum + current.right.val);
            }
        }

        return false;
    }
}
