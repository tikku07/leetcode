
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length; // Fixed: Changed 'Intervals' to lowercase 'intervals'
        
        // 1. Add all intervals to the left (no overlap)
        while(i < n && newInterval[0] > intervals[i][1]){ // Fixed: 'intervals'
            res.add(intervals[i]); // Fixed: 'intervals'
            i++;
        }
        
        // 2. Merge overlapping intervals
        while(i < n && newInterval[1] >= intervals[i][0]){ // Fixed: 'intervals'
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // Fixed: 'intervals'
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // Fixed: 'intervals'
            i++;
        }
        res.add(newInterval);
        
        // 3. Add all remaining intervals to the right
        while(i < n){ 
            res.add(intervals[i]); // Fixed: 'intervals'
            i++;
        }
        
        return res.toArray(new int[res.size()][]);   
    }
}
