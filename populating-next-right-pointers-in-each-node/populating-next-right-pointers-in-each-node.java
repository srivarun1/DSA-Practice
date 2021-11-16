/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            int s = q.size();
            
            for(int i = 0; i < s; i++){
                Node node = q.poll();
                if(node.left == null) continue;
                node.left.next = node.right;
                if(node.next != null){
                    node.right.next = node.next.left;
                }
                q.add(node.left);
                q.add(node.right);
            }
        }
        return root;
        
    }
}