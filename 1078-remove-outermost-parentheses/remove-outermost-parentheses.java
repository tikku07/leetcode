class Solution {
    public String removeOuterParentheses(String s) {
         int level=0;
        StringBuilder result =new StringBuilder();
        char ch=' ';
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='(') {
                level++;
                if(level>1) result.append(ch);
            }
             else if(ch==')') {
                level--;
                if(level>0) result.append(ch);
            }
        }
        return result.toString();
    }
}