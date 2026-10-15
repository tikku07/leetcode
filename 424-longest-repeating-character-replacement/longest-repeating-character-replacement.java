class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxlen=0;
        int maxfreq=0;
        int changes=0;
        int n=s.length();
        Arrays.fill(hash,0);

        int l=0,r=0;
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
            // maxlen=Math.max(maxlen,r-l+1);
            if((r-l+1)-maxfreq>k){
               hash[s.charAt(l)-'A']--; 
               l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}