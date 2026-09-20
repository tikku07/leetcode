class Solution {
    public int reverseDegree(String s) {
        int product=1;
        int sum=0;
        int oi=0;
        int ni=0;
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++){
            oi=i+1;
            ni=26-(s.charAt(i) - 'a');;
            product=oi*ni;
            sum+=product;
            
        }
        return sum;
    }
}