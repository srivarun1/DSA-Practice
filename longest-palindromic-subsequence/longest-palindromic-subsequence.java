class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] word = s.toCharArray();
        
        char[] reverseWord = new StringBuilder(s).reverse().toString().toCharArray();
        
        int[][] dp = new int[s.length()+1][s.length()+1];
        
        for(int i = 1; i <= word.length; i++)
        {
            for(int j = 1; j <= word.length; j++)
            {
                if(word[i-1] == reverseWord[j-1])
                {
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[word.length][word.length];
    }
}