class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] flag = new int[nums.length];
        List<Integer> list = new ArrayList();
        Arrays.fill(flag,-1);
        for(int num : nums){
            flag[num-1] = num-1;
        }
        
        for(int i = 1; i <= nums.length;i++){
            if(flag[i-1] == -1){
                list.add(i);
            }
        }
        
        return list;
    }
}