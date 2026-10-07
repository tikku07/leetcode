class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt=1;
        int n=intervals.length;
        
       
        Integer[] pos = new Integer[n];
        for (int i = 0; i < n; i++) {
            pos[i] = i;
        }
        Comparator<Integer>comp=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                 return Integer.compare(intervals[i][1], intervals[j][1]);

            }
        };
        Arrays.sort(pos,comp);
        
        int endtime=intervals[pos[0]][1];
        for(int i=1;i<intervals.length;i++){
            int ind=pos[i];
            if(intervals[ind][0]>=endtime){
                cnt++;
                endtime=intervals[ind][1];
            }
        }
        return n-cnt;
    }
}