class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr = new int[n];
        int k=n-1;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]) {
                st.pop();
            }
            int top = !st.isEmpty() ? st.peek() : -1;
            if(top!=-1) {
            arr[k--]= top-i;
            }else {
                arr[k--]=0;
            }
            st.push(i);
        }
        return arr;
    }
}
