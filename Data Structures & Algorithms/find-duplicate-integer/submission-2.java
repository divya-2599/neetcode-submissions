class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0, slow=0;
        while(slow<nums.length) {
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }
        slow=0;
        while(slow!=fast) {
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;

    }
}
