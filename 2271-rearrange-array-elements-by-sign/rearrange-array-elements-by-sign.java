class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0; // Starts at 0 for positive numbers (even indices)
        int negIndex = 1; // Starts at 1 for negative numbers (odd indices)
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[posIndex] = nums[i];
                posIndex += 2;
            } else {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        
        return ans;
    }
}
