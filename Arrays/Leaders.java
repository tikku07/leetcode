// 512. Leaders in an Array
// Given an integer array nums, return a list of all the leaders in the array.

// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

// Example 1:
// Input: nums = [1, 2, 5, 3, 1, 2]

// Output: [5, 3, 2]

// Explanation:

// 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

// Example 2:
// Input: nums = [-3, 4, 5, 1, -4, -5]

// Output: [5, 1, -4, -5]

// Explanation:

// -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]



class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return al;
        }
        
        int max = Integer.MIN_VALUE;
        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= max) {
                al.add(nums[i]);
                max = nums[i];
            }
        }
        
        // Since we traversed from right to left, the leaders are in reverse order.
        // Reverse the list to get them in the original left-to-right order.
        Collections.reverse(al);
        return al;
    }
}
