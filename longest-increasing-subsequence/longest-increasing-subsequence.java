class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        
        for(int i = 1; i < nums.length; i++)
        {
            for(int j=i-1;j >=0;j--)
            {
                if(nums[j] < nums[i])
                {
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        
        int max = 1;
        
        for(int val : dp) max = Math.max(max,val);
        
        return max;
    }
}