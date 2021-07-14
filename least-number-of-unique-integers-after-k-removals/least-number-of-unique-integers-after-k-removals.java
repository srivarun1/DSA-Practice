class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x,y) -> map.get(x)-map.get(y));
        
        for(int num : arr)
        {
            map.merge(num,1,(x,y) -> x+y);
        }
        
        for(int key : map.keySet())
        {
            pq.add(key);
        }
        
        int cnt = 0;
        while(k > 0)
        {
            k-=map.get(pq.poll());
            if(k < 0) return map.size()-cnt;
            cnt++;
        }
        return map.size()-cnt;
    }
}