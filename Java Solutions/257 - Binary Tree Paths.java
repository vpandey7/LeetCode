/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        findPath(root, "", paths);
        return paths;

    }

    private void findPath(TreeNode root, String current, List<String> paths) {
        current = current + root.val;

        if (root.left == null && root.right == null) {
            paths.add(current);
        }
        if (root.left != null) {
            findPath(root.left, current + "->", paths);
        }
        if (root.right != null) {
            findPath(root.right, current + "->", paths);
        }

    }
}