class MyStack {
 Queue<Integer> q=new LinkedList<>();
    int size=0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
      if(size>0){
        for(int i=0;i<size;i++){
            q.add(q.remove());
            
        }
      }
size++;
    }
    
    public int pop() {
         size--;
      return q.remove();
    }
    
    public int top() {
        return q.element();
    }
    
    public boolean empty() {
          return (size==0);  
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */