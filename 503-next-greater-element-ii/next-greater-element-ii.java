class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // Loop from 2 * n - 1 down to 0 to simulate the circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Remove smaller or equal elements from the stack
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            
            // Only populate the output array during the actual index range (0 to n-1)
            if (i < n) {
                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }
            
            // Push the current element onto the stack
            st.push(nums[i % n]);
        }
        
        return nge;
    }
}
