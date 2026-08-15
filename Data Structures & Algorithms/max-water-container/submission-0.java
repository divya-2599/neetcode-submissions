class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0, j=n-1, maxm = Integer.MIN_VALUE, area=0;
        while(i<j) {
            if(heights[i]<heights[j]) {
                area=heights[i]*(j-i);
                i++;
            }else {
                area=heights[j]*(j-i);
                j--;
            }
            maxm=Math.max(maxm, area);
        }
        return maxm;
    }
}
