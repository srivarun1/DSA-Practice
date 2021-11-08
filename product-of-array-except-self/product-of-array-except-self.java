class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int curr = nums[0];
        product[0] = 1;
        for(int i = 1; i < nums.length; i++){
            product[i] = curr;
            curr*=nums[i];
        }
        /*
            [1,2,3,4] -> [1,1,2,6]
        */
        curr = nums[nums.length-1];
        for(int i = nums.length-2;i >=0; i--){
            product[i]*=curr;
            curr*=nums[i];
        }
         /*
            [1,2,3,4] -> [1,1,2,6]
            -> [24,1,2,8,6]
        */
        return product;
        
    }
}