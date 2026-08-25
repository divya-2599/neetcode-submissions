class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
       int n=position.length, count=0;
       int[][] arr = new int[n][2];
       for(int i=0;i<position.length;i++) {
        arr[i][0]=position[i];
        arr[i][1]=speed[i];
       }
       Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
       for(int i=n-1;i>=0;i--) {
        double time = (double)(target-arr[i][0])/arr[i][1];
        if(!st.isEmpty()) {
            double top = st.peek();
            if(time>top) {
                st.push(time);
            }
        }else{
            st.push(time);
        }
       }
       return st.size();
    }
}
