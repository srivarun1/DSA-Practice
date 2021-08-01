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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new LinkedList();
        Queue<TreeNode> q = new LinkedList();
        List<Integer> rightValues = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s = q.size();
            
            int temp = -1;
            
            for(int i = 0; i < s; i++)
            {
                TreeNode node = q.poll();
                temp = node.val;
                
                if(node.left != null) q.add(node.left);
                
                if(node.right != null) q.add(node.right);
            }
            
            rightValues.add(temp);
        }
        
        return rightValues;
    }
}