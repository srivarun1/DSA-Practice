class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] set = new int[256];
        int st = 0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            if(set[s.charAt(i)] == 1)
            {
                while(st < i && set[s.charAt(i)] == 1)
                {
                    set[s.charAt(st++)]--;
                }
                set[s.charAt(i)]++;
            }
            else
            {
                set[s.charAt(i)]++;
            }
            //System.out.println(i + "  " + st);
            max = Math.max(max,i-st+1);
        }
        return max;
    }
}