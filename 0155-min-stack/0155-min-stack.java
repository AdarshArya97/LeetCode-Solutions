class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        if(min.isEmpty()||min.peek()>=value){
            min.push(value);
            st.push(value);
        }
        else st.push(value);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int val = st.pop();
            if(min.peek()==val){
                min.pop();
            }
        }
        
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        else return st.peek();
        
    }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
        else return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */