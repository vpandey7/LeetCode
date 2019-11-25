/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            if (currentNode.val >= L && currentNode.val <= R) {
                sum += currentNode.val;
            }
            if (currentNode.left != null && currentNode.val > L) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null && currentNode.val < R) {
                queue.add(currentNode.right);
            }
        }
        return sum;

    }
}