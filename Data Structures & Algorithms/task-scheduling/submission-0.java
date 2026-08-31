class Solution {
    public int leastInterval(char[] tasks, int n) {
        int m =tasks.length;
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(Map.Entry<Character, Integer> mp : map.entrySet()) {
            pq.add(mp.getValue());
        }
        while(!pq.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int slots=0;
            for(int i=0;i<n+1;i++) {
                if(pq.isEmpty()) {
                    continue;
                }
                int x=pq.poll();
                list.add(x-1);
                slots++;
            }
            for(int i=0;i<list.size();i++) {
                if(list.get(i)>0) {
                    pq.add(list.get(i));
                }
            }
            if(!pq.isEmpty())
            count+=n+1;
            else
            count+=slots;
        }
        return count;
    }
}
