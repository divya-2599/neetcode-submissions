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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0, x=0;
        ListNode list = new ListNode(-1);
        ListNode ans = list;
        while(l1!=null || l2!=null) {
            if(l1==null) {
                x=l2.val+carry;
            }else if(l2==null) {
                x=l1.val+carry;
            }else {
            x=l1.val+l2.val+carry;
            }
            int rem=x%10;
            list.next = new ListNode(rem);
            list=list.next;
            carry = x/10;
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
        }
        if(carry!=0) {
           list.next = new ListNode(carry); 
        }
        return ans.next;
    }
}
