class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    
        int n = intervals.length;
        if (n <= 1) return 0; // If 0 or 1 interval, 0 removals are needed
       
        // 1. Sort the 2D array directly by the end times (index 1)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int cnt = 1; // Tracks how many intervals we CAN KEEP
        int endtime = intervals[0][1]; // The earliest end time after sorting
        
        // 2. Iterate through the sorted intervals starting from index 1
        for (int i = 1; i < n; i++) {
            // If the current interval starts after or when the previous ends, keep it
            if (intervals[i][0] >= endtime) {
                cnt++;
                endtime = intervals[i][1];
            }
        }
        
        // 3. Return the number of intervals to REMOVE
        return n - cnt; 
    }
}

 