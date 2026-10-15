class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int l=0,r=0,k=2;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=fruits.length;
        while(r<n){
            if(mpp.containsKey(fruits[r])){
                mpp.put(fruits[r],mpp.get(fruits[r])+1);
            }
            else{
                mpp.put(fruits[r],1);
            }
            if(mpp.size()>k){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                if(mpp.get(fruits[l]) == 0) mpp.remove(fruits[l]);
                 l++;
            }
            if(mpp.size()<=k){
               maxlen=Math.max(maxlen,r-l+1);
            }
           r++;
        }
        return maxlen;
    }
}