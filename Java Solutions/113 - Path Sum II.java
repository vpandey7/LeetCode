/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> returnList = new ArrayList<>();

        findPathSum(root, sum, new ArrayList<Integer>(), returnList);
        return returnList;

    }

    public void findPathSum(TreeNode root, int sum, List<Integer> current, List<List<Integer>> returnList) {
        if (root == null) {
            return;
        }
        current.add(root.val);
        if (root.left == null && root.right == null && root.val - sum == 0) {
            returnList.add(current);
        }
        findPathSum(root.left, sum - root.val, new ArrayList<Integer>(current), returnList);
        findPathSum(root.right, sum - root.val, new ArrayList<Integer>(current), returnList);

    }
}