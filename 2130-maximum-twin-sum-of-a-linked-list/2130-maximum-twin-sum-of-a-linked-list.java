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
    // public int pairSum(ListNode head) {
    //     ListNode temp = head;
    //     int n = length(head);

    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i <= n/2 - 1; i++){
    //         int res = getNodeValue(head, i) + getNodeValue(head, n - 1 - i);
    //         max = Math.max(res, max);
    //     }

    //     return max;
    // }

    // public int getNodeValue(ListNode head, int k){
    //     ListNode temp = head;
    //     for(int i = 0; i < k; i++){
    //         temp = temp.next;
    //     }
    //     return temp.val;
    // }

    // public int length(ListNode head){
    //     ListNode temp = head;
    //     int len = 0;
    //     while(temp != null){
    //         len++;
    //         temp = temp.next;
    //     }
    //     return len;
    // }


    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow);

        int max = 0;
        ListNode first = head;
        ListNode second = secondHalf;
        while(second != null){
            max = Math.max(first.val + second.val, max);
            first = first.next;
            second = second.next;
        }

        return max;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}