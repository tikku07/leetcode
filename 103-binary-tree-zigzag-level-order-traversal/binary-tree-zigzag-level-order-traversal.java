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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return list;
        int flag=0;
        queue.add(root);
          while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = queue.size();

            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                temp.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            if(flag == 1){
                Collections.reverse(temp);
                list.add(temp);
                flag = 0;
            } else{
               list.add(temp);
                flag = 1;
            }}
        
        return list;
    }
}