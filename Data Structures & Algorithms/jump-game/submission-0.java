class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxm = 0;
        for(int i=0;i<n;i++){
            if(i>maxm)
            return false;
            maxm=Math.max(maxm, i+nums[i]);
            if(maxm>=n-1)
            return true;
        }
        return true;
    }
}
