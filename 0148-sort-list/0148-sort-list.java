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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = middleNode(head);
        ListNode headB = mid.next;
        mid.next = null;
        
        ListNode A = sortList(head);
        ListNode B = sortList(headB);
        
        return mergeList(A, B);
    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode mergeList(ListNode A, ListNode B){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(A != null && B != null){
            if(A.val <= B.val){
                temp.next = A;
                A = A.next;
                temp = temp.next;
            }

            else{
                temp.next = B;
                B = B.next;
                temp = temp.next;
            }
        }

        if(A == null) temp.next = B;
        if(B == null) temp.next = A;

        return dummy.next;
    }
}