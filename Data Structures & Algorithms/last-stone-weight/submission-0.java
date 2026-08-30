class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        int n=stones.length;
        for(int i=0;i<n;i++) {
            pq.add(stones[i]);
        }
        while(!pq.isEmpty()) {
            int x=pq.poll();
            if(pq.isEmpty())
            return x;
            int y=pq.poll();
            if(x==y) {
                continue;
            }else if(x<y) {
                pq.add(y-x);
            }else{
                pq.add(x-y);
            }
        }
        if(!pq.isEmpty())
        return pq.poll();
        return 0;
    }
}
