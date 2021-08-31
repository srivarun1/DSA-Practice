class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        
        while(lo <= hi)
        {
            int mid = (lo+hi)/2;
            
            if(nums[mid] == target)
            {
                return expandFromCenter(nums, mid, target);
            }
            else if(nums[mid] < target)
            {
                lo = mid+1;
            }
            else
            {
               hi = mid-1;
            }
            
        }
        
        return new int[]{-1,-1};
    }
    
    
    public int[] expandFromCenter(int[] nums, int mid, int target)
    {
        int lo = mid, hi = mid;
        
        while(lo > 0)
        {
            if(nums[lo-1] == target)
            {
                lo--;
            }
            else
            {
                break;
            }
        }
        
        while(hi < nums.length-1)
        {
            if(nums[hi+1] == target)
            {
                hi++;
            }
            else
            {
                break;
            }
        }
        
        return new int[]{lo,hi};
    }
}