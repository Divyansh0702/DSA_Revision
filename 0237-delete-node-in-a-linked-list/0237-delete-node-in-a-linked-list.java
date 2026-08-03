/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
       
       
        // ListNode temp = node;
        // while(temp != null){
        //     temp.val = temp.next.val;
        //     if(temp.next.next == null){
        //         temp.next = null;
        //         break;    
        //     } 
        //     temp = temp.next;
        // }
    }
}