class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int max = 0;
        int curr = 0;
        for(int num : nums)
        {
            set.add(num);
        }
        
        for(int num : nums)
        {
            if(!set.contains(num-1))
            {
                int temp = num;
                while(set.contains(temp))
                {
                    curr++;
                    temp++;
                }
                max = Math.max(max,curr);
                curr=0;
            }
        }
        
        return max;
    }
}