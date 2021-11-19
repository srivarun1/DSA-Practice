class Trie {
    TrieNode head;

    public Trie() {
        head = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = head;
        for(char c : word.toCharArray()){
            if(curr.map.get(c) == null){
                curr.map.put(c,new TrieNode());
            }
            curr = curr.map.get(c);
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
         TrieNode curr = head;
        for(char c : word.toCharArray()){
            if(curr.map.get(c) == null){
                return false;
            }
            curr = curr.map.get(c);
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = head;
        for(char c : prefix.toCharArray()){
            if(curr.map.get(c) == null){
                return false;
            }
            curr = curr.map.get(c);
        }
        return true;
    }
}

class TrieNode{
    Map<Character,TrieNode> map = new HashMap();
    boolean isEnd = false;
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */