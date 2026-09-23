class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0, index=0, maxm=Integer.MIN_VALUE, total=0;
        for(int i=0;i<gas.length;i++) {
            int cost1=gas[i]-cost[i];
            sum+=cost1;
            total+=cost1;
            if(total<0){
                total=0;
                index=i+1;
            }
        }
        if(sum>=0)
        return index;
        return -1;
    }
}
