/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            for( int i =0;i<size;i++){
                TreeNode currentNode = queue.poll();
                if( i==size-1){
                    result.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);  
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);  
                }
                
            }
        }
        return result;
        
        
        
        
        
    }
}