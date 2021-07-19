class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((p,q) -> q[1]-p[1]);
        int count = 0;
        
        for(int[] box : boxTypes)
        {
            pq.add(box);
        }
        
        while(!pq.isEmpty() && truckSize > 0)
        {
            int[] curr = pq.poll();
            if(truckSize-curr[0] < 0) 
            {
                for(int i =0 ; i<curr[0];i++)
                {
                    truckSize-=1;
                    if(truckSize < 0) return count;
                    count+=curr[1];
                }
            }
            truckSize-=curr[0];
            count+=curr[1]*curr[0];
        }
        
        return count;
        
        
    }
}