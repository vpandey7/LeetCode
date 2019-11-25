/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode currentNode = root;
        while (true) {
            if (currentNode.val > val) {
                if (currentNode.left == null) {
                    currentNode.left = new TreeNode(val);
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else if (currentNode.val < val) {
                if (currentNode.right == null) {
                    currentNode.right = new TreeNode(val);
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }

        }
        return root;
    }
}