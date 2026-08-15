class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxleft = height[0], maxright=height[n-1];
        int i=1,j=n-2, sum=0;
        while(i<=j) {
            if(maxleft<maxright) {
              if(height[i]>maxleft) {
                maxleft=height[i];
              }else{
                sum+=maxleft-height[i];
              }
              i++;
            }else{
               if(height[j]>maxright) {
                maxright=height[j];
               }else {
                sum+=maxright-height[j];
               }
               j--;
            }
        }
        return sum;
    }
}
