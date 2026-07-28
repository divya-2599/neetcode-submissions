class LRUCache {
    int capacity;
    LinkedList left;
    LinkedList right;
    Map<Integer, LinkedList> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map = new HashMap<>();
        this.left = new LinkedList(-1, -1);
        this.right = new LinkedList(-1, -1);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            LinkedList node = map.get(key);
            delete(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            LinkedList node = map.get(key);
            delete(node);
            node.val = value;
            insert(node);
            return;
        }else if(map.size()==capacity){
            map.remove(right.prev.key);
            delete(right.prev);
        }
            LinkedList node = new LinkedList(key, value);
            insert(node);
            map.put(key, node);
        
    }

    public void insert (LinkedList node) {
        node.prev= this.left;
        node.next=this.left.next;
        this.left.next=node;
        node.next.prev=node;
    }

    public void delete(LinkedList node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

class LinkedList {
    int key, val;
    LinkedList prev;
    LinkedList next;
    public LinkedList(int key, int val) {
        this.key=key;
        this.val = val;
        this.prev=null;
        this.next=null;
    }
}
