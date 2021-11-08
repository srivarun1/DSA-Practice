class Solution {
    public int missingNumber(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        
        for(int num : nums){
            if(num < nums.length){
                flag[num] = true;
            }
        }
        
        for(int i = 0 ;i < nums.length;i++){
            if(!flag[i]) return i;
        }
        
        return nums.length;
    }
}