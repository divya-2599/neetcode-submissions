class Solution {
    public int maxSubArray(int[] nums) {
        int ma=nums[0];
        int mg=nums[0];
        for(int i=1;i<nums.length;i++) {
            mg = Math.max(mg+nums[i], nums[i]);
            ma = Math.max(ma,mg);
        }
        return ma;
    }
}
