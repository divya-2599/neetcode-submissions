class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int z=0, flag=0;
        Map<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        List<List<Integer>> list = new ArrayList<>(n+1);
        for(int i=0;i<n+1;i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }
        
        for(int i=n;i>0;i--) {
            if(!list.get(i).isEmpty()) {
                System.out.println(list.get(i));
                for(int ele : list.get(i)) {
                    if(z>=k) {
                        flag=1;
                        break;
                    }
                    
                    arr[z++]=ele;
                }
            }
            if(flag==1)
            break;
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
