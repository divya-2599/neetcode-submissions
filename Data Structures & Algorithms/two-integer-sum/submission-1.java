class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])) {
               arr[0]=i;
               arr[1]=map.get(target-nums[i]);
               break;
            }
            map.put(nums[i], i);
        }
        if(arr[0]>arr[1]) {
            int temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        return arr;
    }
}
