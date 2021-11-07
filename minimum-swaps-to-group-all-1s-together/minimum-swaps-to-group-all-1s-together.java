class Solution {
    public int minSwaps(int[] data) {
        int windowSize = 0;
        int count = 0;
        int minSwaps = Integer.MAX_VALUE;
        int start = 0;
        for(int num : data){
            windowSize+=num;
        }
        
        if(windowSize == data.length) return 0;
        
        
        for(int i = start; i < data.length; i++){
            count+=data[i];
            
            while(i-start+1 > windowSize){
                count-=data[start++];
            }
            minSwaps = Math.min(minSwaps,windowSize-count);
        }
        return minSwaps;
    }
}