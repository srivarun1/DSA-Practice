class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int la = Integer.MAX_VALUE;
        int lb = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < wordsDict.length; i++)
        {
            String curr = wordsDict[i];
            if(curr.equals(word1))
            {
                la = i;
                
                min = Math.min(min, Math.abs(la-lb));
            }
            if(curr.equals(word2))
            {
                lb = i;
                
                min = Math.min(min,Math.abs(la-lb));
            }
        }
        
        return min;
    }
}