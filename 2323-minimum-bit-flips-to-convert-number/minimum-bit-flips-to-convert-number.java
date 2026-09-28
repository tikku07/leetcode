class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder sb=new StringBuilder();
        int cnt=0,cnt1=0;
        int count=0,bits=0;
        int n= start;
        int m= goal;
        while(n>0){
        cnt++;
            n=n/2;
        }
          while(m>0){
            cnt1++;
            m=m/2;
        }
        int ans=start^goal;
        bits=Math.max(cnt,cnt1);
        for(int i=0;i<bits;i++){
                if((ans&(1<<i))!=0) count++;
        }
        return count;
    }
}