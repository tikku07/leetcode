class Solution {
    public int maxDepth(String s) {
        int l=0;
        int r=0;
        int cnt=0;
        for(int i=0;i<s.length()-1;i++){
           
            if(s.charAt(i)=='(') l++;
            else if (s.charAt(i) == ')') r++;

             if(cnt<l-r) cnt=l-r;
      
        }
         return cnt;
    }
}