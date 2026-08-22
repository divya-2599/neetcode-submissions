class MinStack {
    Stack<Pair> st = new Stack<>();

    public MinStack() {
        //Stack<Pair> st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            st.push(new Pair(val, val));
            return;
        }
        Pair top = st.peek();
        if(top.value<val) {
            st.push(new Pair(val, top.value));
        }else {
            st.push(new Pair(val, val));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        Pair top = st.peek();
        return top.key;
    }
    
    public int getMin() {
        Pair top = st.peek();
        return top.value;
    }
}

class Pair {
    int key;
    int value;
    public Pair(int key, int value) {
        this.key=key;
        this.value=value;
    }
}
