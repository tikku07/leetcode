class Solution {
    public int lengthOfLongestSubstring(String s) {
    int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int l=0,r=0,max=0,len=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1 && hash[s.charAt(r)] >=l){
                l=hash[s.charAt(r)]+1;

            }
            len=r-l+1;
            max=Math.max(len,max);
            hash[s.charAt(r)]=r;
            r++;

        }
return max;    
    }
}