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
     List<List<Integer>> result = new ArrayList<>();
        if(root==null)
         return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
         boolean reverse = false;

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size();
            for(int i=0; i<levelSize;i++){
                TreeNode temp = queue.remove();
                if(reverse){
                    level.add(0,temp.val);
                }else{
                    level.add(temp.val);
                }
                
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }

            }
            result.add(level);
            reverse = !reverse;
        } 
        return result;
    }
}