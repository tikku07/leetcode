import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there is no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.peek();
                // Check if the top of the stack matches the current closing bracket
                if ((ch == ')' && top == '(') || 
                    (ch == ']' && top == '[') || 
                    (ch == '}' && top == '{')) {
                    st.pop(); // Valid match found, remove it
                } else {
                    return false; // Mismatched bracket type (e.g., "(]")
                }
            }
        }
        
        // If the stack is empty, all brackets were properly matched
        return st.isEmpty();
    }
}
