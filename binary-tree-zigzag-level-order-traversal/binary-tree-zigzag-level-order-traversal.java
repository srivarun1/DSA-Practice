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
        List<List<Integer>> zigZagTraversal = new ArrayList();
        
        if(root == null) return zigZagTraversal;
        
        Queue<TreeNode> queue = new LinkedList();
        
        queue.add(root);
        
        boolean isForward = true;
        
        while(!queue.isEmpty())
        {
            List<Integer> currentTraversal = new LinkedList();
            
            int s = queue.size();
            
            for(int i = 0 ;i  < s; i++)
            {
                TreeNode curr = queue.poll();
                
                if(curr.left != null) queue.add(curr.left);
                
                if(curr.right != null) queue.add(curr.right);
                
                if(isForward)
                {
                    currentTraversal.add(curr.val);
                }
                else
                {
                    currentTraversal.add(0,curr.val);
                }
            }
            isForward = !isForward;
            zigZagTraversal.add(currentTraversal);
        }
        
        return zigZagTraversal;
    }
}