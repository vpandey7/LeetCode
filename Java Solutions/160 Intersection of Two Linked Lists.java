/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB == null) return null;
        
        ListNode aNode = headA;
        ListNode bNode = headB;
        
        while(aNode!=bNode){
            
            if(aNode == null){
                aNode = headB;
            }else{
                aNode = aNode.next;
            }
            
            if(bNode == null){
                bNode = headA;
            }else{
                bNode = bNode.next;
            }
            
        }
        return aNode;
    }
}