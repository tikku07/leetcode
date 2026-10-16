/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> arr = new ArrayList<>(); 
        
        // Base case: Return the empty list instead of null
        if (root == null) return arr; 
        
        // 1. Process root node
        arr.add(root.val); 
        
        // 2. Collect and add all items from the left subtree
        arr.addAll(preorderTraversal(root.left)); 
        
        // 3. Collect and add all items from the right subtree
        arr.addAll(preorderTraversal(root.right)); 
        
        return arr;     
    }
}