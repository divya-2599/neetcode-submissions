class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxm = Arrays.stream(piles).max().orElse(Integer.MIN_VALUE);
        int l=1, r=maxm;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if (canEatBananas(piles, mid, h)) {
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }

    private boolean canEatBananas(int[] piles, int mid, int h) {
        int sum =0;
        for(int i=0;i<piles.length;i++) {
            sum+=Math.ceil((double)piles[i]/mid);
        }
        if (sum<=h)
        return true;
        return false;
    }
}
