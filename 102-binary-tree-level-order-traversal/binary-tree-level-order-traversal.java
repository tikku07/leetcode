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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> list=new ArrayList<>();
       Queue<TreeNode> queue=new LinkedList<>();
       if(root==null) return list;
       queue.add(root);
       
       while(!queue.isEmpty()){
        List<Integer> current=new ArrayList<>();
        int lvl=queue.size();
       
        for(int i=0;i<lvl;i++){
             TreeNode currentNode=queue.poll();
            current.add(currentNode.val);
              if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
          list.add(current);  
        }
        
        return list;
       }
       
    
}