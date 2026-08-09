class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->Integer.compare(a.value,b.value));
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));

if (pq.size() > k) {
    pq.poll();
}
        }
        for(int i=0;i<k;i++) {
            arr[i]=!pq.isEmpty() ? pq.poll().key : null;
        }
        return arr;
        
    }
}

class Pair {
    int key;
    int value;
    public Pair(int key, int value) {
        this.key=key;
        this.value=value;
    }
}
