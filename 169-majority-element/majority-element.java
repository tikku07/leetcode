class Solution {
    public int majorityElement(int[] nums) {
         int max=0;
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            element=nums[i];
            if(count==0) max=element;
            if(max==element) count++;
            else count--;

        }
        return max;
    }
}