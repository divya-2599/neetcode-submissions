class KthLargest {
    PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            pq.add(nums[i]);
            if(pq.size()>k) {
                pq.poll();
            }
        }

    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k) {
            pq.poll();
        }
        return pq.peek();
    }
}
