/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        int max = head.val;

        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val < max){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
                max = temp.val;
            }
        }

        return reverse(head);
    }
}