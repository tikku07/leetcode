class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack();
        int inner = 0;
        st.push(0);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(0);
            }
            else{
                inner = st.pop(); // Take out the inner cup
                
                int score = 0;
                if(inner > 0) {
                    score = 2 * inner; 
                } else {
                    score = 1;
                }
                
               
                int outer = st.pop(); 
                st.push(score + outer);
            }
        }
        return st.pop();
    }
}
