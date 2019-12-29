/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sumqueue = new LinkedList<>();
        queue.offer(root);
        sumqueue.offer(sum - root.val);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int currSum = sumqueue.poll();

            if (curr.left == null && curr.right == null && currSum == 0) {
                return true;
            }
            if (curr.left != null) {
                queue.offer(curr.left);
                sumqueue.offer(currSum - curr.left.val);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
                sumqueue.offer(currSum - curr.right.val);
            }
        }
        return false;

    }
}