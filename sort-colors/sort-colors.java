class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        
        
        for (int  num : nums) {
            if (num == 0) zero ++;
            else if (num == 1) one++; 
            else two++;
        }
        //System.out.println(zero + " " + one + " " + two);
        int i = 0;
        
        while(zero > 0){
            nums[i++] = 0;
            zero--;
        }
        
        while(one > 0){
            nums[i++] = 1;
            one--;
        }
        
        while(two > 0){
            nums[i++] = 2;
            two--;
        }
    }
}