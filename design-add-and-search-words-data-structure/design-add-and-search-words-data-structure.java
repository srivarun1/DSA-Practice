class WordDictionary {

    /** Initialize your data structure here. */
    Trie head;
    public WordDictionary() {
        head = new Trie();
    }
    
    public void addWord(String word) {
        Trie curr = head;
        for(char c : word.toCharArray())
        {
            if(curr.next[c-'a'] == null)
            {
                curr.next[c-'a'] = new Trie();
            }
            curr = curr.next[c-'a'];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return search(0,word,head);
    }
    
    public boolean search(int index,String word, Trie curr)
    {
        if(curr == null) return false;
        //System.out.println(word + " " + index);
        for(int i = index; i < word.length(); i++)
        {
            if(word.charAt(i) == '.')
            {
                for(int k = 0; k < 26;k++)
                {
                    if(search(i+1,word, curr.next[k]))
                    {
                        return true;
                    }
                }
                return false;
            }
            else
            {
                if(curr != null && curr.next[word.charAt(i)-'a'] != null) 
                {
                    curr = curr.next[word.charAt(i)-'a'];
                }
                else return false;
                
            }
        }
        return curr != null && curr.isEnd;
    }
    
}

class Trie{
    Trie[] next = new Trie[26];
    boolean isEnd = false;
    public Trie(){}
    
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */