class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.add(i);
            }else if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                   st.pop();
                }else if(!st1.isEmpty()){
                    st1.pop();
                }else{
                    return false;
                }
            }else{
                st1.add(i);
            }
        }
        while(!st.isEmpty() && !st1.isEmpty()){
            if(st.peek()>st1.peek()){
                return false;
            }
            st.pop();
            st1.pop();
        }
        return st.isEmpty();
    }
}
