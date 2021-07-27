class Solution {
    public int[] findBuildings(int[] heights) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>((x,y) -> x-y);
        int max = 0;
        pq.add(heights.length-1);
        for(int i = heights.length-2; i >=0 ;i--)
        {
            if(heights[i] > heights[i+1] && heights[i] > max)
            {
                pq.add(i); 
            }
            max = Math.max(max, Math.max(heights[i],heights[i+1]));
        }
        int[] ret = new int[pq.size()];
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = pq.poll();
        }
        
        return ret;
    }
}