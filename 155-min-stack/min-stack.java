

class MinStack {
    // 1. Change the Stack to hold Long to prevent math overflow
    Stack<Long> st = new Stack<>();
    long mini; 

    public MinStack() {
        // Safe placeholder, though it will be overwritten on the first push
        mini = Long.MAX_VALUE; 
    }
    
    public void push(int val) {
        long value = (long) val; // Cast incoming int to long
        
        if (st.isEmpty()) {
            st.push(value);
            mini = value;
        } else {
            if (value >= mini) { 
                st.push(value);
            } else {
                // Formula to store an encrypted, smaller value
                st.push(2 * value - mini); 
                mini = value; // Update global minimum
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        
        long x = st.pop();
        // If x is smaller than mini, it means x was an encrypted value
        if (x < mini) {
            mini = 2 * mini - x; // Restore the previous minimum
        }
    }
    
    public int top() {
        if (st.isEmpty()) return -1;
        
        long topElement = st.peek();
        // If the top element is encrypted, the actual value is 'mini'
        if (topElement < mini) {
            return (int) mini;
        }
        return (int) topElement;
    }
    
    public int getMin() {
        return (int) mini;
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