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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for(ListNode list : lists) {
            res = mergeTwoSortedList(res, list);
        }
        return res;
    }

    public ListNode mergeTwoSortedList(ListNode list1, ListNode list2) {
        ListNode i=list1,j=list2;
        if(i==null)
        return j;
        else if(j==null)
        return i;
        ListNode curr=null;
        ListNode temp=new ListNode(-1);
        curr=temp;
        while(i!=null && j!=null) {
            if(i.val<j.val) {
                temp.next=i;
                i=i.next;
            }else {
                temp.next=j;
                j=j.next;
            }
            temp=temp.next;
        }
        if(i!=null) {
            temp.next=i;
        }
        if(j!=null) {
            temp.next=j;
        }
        return curr.next;
    }
}
