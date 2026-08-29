class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if(nums1.length>nums2.length)
        return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length;
        int n = nums2.length;
        int l=0, r=nums1.length;
        int firstHalfLength = (m+n+1)/2;
        while(l<=r) {
            int mid = l+(r-l)/2;
            int y=firstHalfLength-mid;
            int x1 = mid==0 ? Integer.MIN_VALUE : nums1[mid-1];
            int x2 = y==0 ? Integer.MIN_VALUE : nums2[y-1];
            int x3 = mid==m ? Integer.MAX_VALUE : nums1[mid];
            int x4 = y==n ? Integer.MAX_VALUE : nums2[y];
            if(x1<=x4 && x2<=x3) {
                if((m+n)%2==1) {
                    return Math.max(x1,x2);
                }else{
                    return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
                }

            }
            if(x1>x4) {
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
