class Solution {
    
    //digit less than
    //chose 1
    private char[] num;
    private int N;
    private int[][][] dp = new int[14][14][2];
    
    private int rec(int idx, int seenOne, boolean numLess) {
        if (idx == N) {
            return seenOne;
        }
        
        
        if (dp[idx][seenOne][numLess ? 1 : 0] != -1) {
            return dp[idx][seenOne][numLess ? 1 : 0];
        }
        
        int total = 0;
        
        int limit = 9;
        if (!numLess) {
            limit = (int) (num[idx] - '0');
        }
        
        for (int dig = 0; dig <= limit; dig++) {        
            boolean nextNumLess = false;
            if (numLess) {
                nextNumLess = true;
            } else {
                if (dig < limit) {
                    nextNumLess = true;
                } else {
                    nextNumLess = false;
                }
                
            }
            total += rec(idx+1, seenOne + ( dig == 1 ? 1 : 0), nextNumLess);
        }
        dp[idx][seenOne][numLess ? 1 : 0] = total;
        return total;
    
    }
    
    public int countDigitOne(int n) {
        for (int i = 0; i < 14; ++i) {
            for (int j = 0; j < 14; ++j) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }
        
        
        this.num = (n + "").toCharArray();
        this.N = num.length;
        return rec(0, 0, false);   
    }
}