/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        Map<Node, Node> cloneGraphLookup = new HashMap();
        return cloneGraph(node,cloneGraphLookup);
    }
    
    public Node cloneGraph(Node node, Map<Node, Node> cloneGraphLookup) {
       if(cloneGraphLookup.containsKey(node)) return cloneGraphLookup.get(node);
        
        Node cloneNode = new Node(node.val);
        
        cloneGraphLookup.put(node,cloneNode);
        
        for(Node next : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(next,cloneGraphLookup));
        }
        return cloneNode;
    }
}