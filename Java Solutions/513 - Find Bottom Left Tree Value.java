/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int result = -1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (i == 0) {
                    result = current.val;
                }
                if (current.left != null) {
                    queue.offer(current.left);

                }
                if (current.right != null) {
                    queue.offer(current.right);

                }

            }

        }
        return result;

    }
}