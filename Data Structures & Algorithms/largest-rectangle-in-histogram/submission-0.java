class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxm = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++) {
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])) {
                    int height = heights[st.pop()];
                    int weidth = st.isEmpty() ? i : i-st.peek()-1;
                    maxm=Math.max(maxm, height*weidth);
                                }
                st.push(i);
            } 
            return maxm;
        } 
}
