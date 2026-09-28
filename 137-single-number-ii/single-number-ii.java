class Solution {
    public int singleNumber(int[] nums) {
        //Optimal

        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++){
            ones=(ones^nums[i])&(~twos);
            twos=(twos^nums[i])&(~ones);

        }
        return ones;
    }
}
//Better
class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
       int ans=0;
       int n=nums.length;
       Arrays.sort(nums);
        for(int i=1;i<n;i=i+3){
            if(nums[i]!=nums[i-1]) return nums[i-1];
        }
        ans=nums[n-1];
        return ans;
    }
}
