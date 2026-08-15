class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=nums.length-1;k>1;k--) {
            if (k<nums.length-1 && nums[k]==nums[k+1])
            continue;
            int target = -nums[k];
            int i=0, j=k-1;
            while(i<j) {
                if(nums[i]+nums[j]==target) {
                    list.add(List.of(nums[i], nums[j], nums[k]));
                    i++;
                    j--;
                    while (i<j && nums[i]==nums[i-1])
                    i++;
                    while(i<j && nums[j]==nums[j+1])
                    j--;
                } else if(nums[i]+nums[j]+nums[k]<0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return list;
    }
}
