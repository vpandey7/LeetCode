/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        return ((level(root, x, 0) == level(root, y, 0)) && (!isSibling(root, x, y)));

    }

    public boolean isSibling(TreeNode node, int x, int y) {
        if (node == null)
            return false;
        boolean check = false;
        if (node.left != null && node.right != null) {
            check = (node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x);
        }
        return check || isSibling(node.left, x, y) || isSibling(node.right, x, y);

    }

    int level(TreeNode node, int x, int lev) {
        if (node == null)
            return 0;
        if (node.val == x)
            return lev;
        int l = level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }
        return level(node.right, x, lev + 1);
    }
}