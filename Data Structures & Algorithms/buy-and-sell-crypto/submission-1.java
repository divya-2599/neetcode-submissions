class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, sell = 0;
        int minm = prices[0];
        for(int i=1;i<n;i++) {
            sell = Math.max(sell, prices[i]-minm);
            minm = Math.min(minm,prices[i]);
        }
        return sell;
    }
}
