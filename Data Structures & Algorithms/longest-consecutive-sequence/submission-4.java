class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0)
       return 0;
       int maxm = Integer.MIN_VALUE;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
       } 

       for(int i=0;i<nums.length;i++) {
        if(map.containsKey(nums[i]-1))
        continue;
        int count=1;
        int j=nums[i];
        while(map.containsKey(j+1)) {
           count++;
           maxm=Math.max(maxm, count);
           j++;
        }
       }
       return maxm ==Integer.MIN_VALUE  ? 1 : maxm;
    }
}
