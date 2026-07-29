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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode curr=head, next;
        int x=k;
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
            return head;
        }
        temp = temp.next;
        }
        while(k>0 && curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            k--;
        }
        head.next=reverseKGroup(curr,x);
        return prev;
    }
}
