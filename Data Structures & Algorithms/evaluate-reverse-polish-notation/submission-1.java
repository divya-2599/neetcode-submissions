class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int z=0;
        for(int i=0;i<tokens.length;i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int x = Integer.parseInt(st.pop());
                int y = Integer.parseInt(st.pop());
                if(tokens[i].equals("+"))
                z=x+y;
                else if(tokens[i].equals("-"))
                z=y-x;
                else if(tokens[i].equals("*"))
                z=x*y;
                else if(tokens[i].equals("/"))
                z=y/x;
                st.push(String.valueOf(z));  
            }else {
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
