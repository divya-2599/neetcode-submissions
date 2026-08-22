class Solution {
    public boolean isValid(String s) {
        int n=s.length(), flag=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
               st.push(s.charAt(i)); 
            }else {
            if(st.isEmpty())
            return false;

            int top = st.pop();
            if(s.charAt(i)==')' && top!='(')
            return false;
            if(s.charAt(i)=='}' && top!='{')
            return false;
            if(s.charAt(i)==']' && top!='[')
            return false;
            }
        }
        if(!st.isEmpty())
        return false;
        return true;
    }
}
