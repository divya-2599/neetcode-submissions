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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.println(slow.next.val);
        ListNode temp = reverse(slow.next);
        slow.next=null;
        //System.out.println(temp.val);
        ListNode curr=head, next=null, tempnxt=null;
        while(temp!=null) {
           next=curr.next;
           tempnxt=temp.next;
           curr.next=temp;
           temp.next=next;
           curr=next;
           temp=tempnxt;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode curr=head, next=null, prev=null;
        //System.out.println(head.val);
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //System.out.println(prev.next.val);
        return prev;
    }
}
