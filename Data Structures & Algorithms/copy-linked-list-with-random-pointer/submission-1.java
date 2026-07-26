/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node newHead = copyList(head, map);
        Node curr = newHead, temp1=newHead;
        // while(temp1!=null) {
        // System.out.println(temp1.val);
        // temp1=temp1.next;
        // }
        Node temp = head;
        while(temp!=null) {
            Node val = temp.random!=null ? temp.random : null;
            //System.out.println(val);
            Node node = map.containsKey(val) ? map.get(val) : null;
            System.out.println(node!=null?node.val:null);
            newHead.random=node;
            temp=temp.next;
            newHead=newHead.next;
        }
        // while(curr!=null) {
        // System.out.println(curr.val);
        // curr=curr.next;
        // }
        return curr;
    }

    public Node copyList(Node head, Map<Node, Node> map){
        Node temp=head;
        if(temp==null)
        return null;
            Node node = new Node(temp.val);
            map.put(temp, node);
            node.next=copyList(temp.next, map);
        return node;
    }
}
