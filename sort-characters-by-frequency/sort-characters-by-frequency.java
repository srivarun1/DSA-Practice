class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap();
        PriorityQueue<Character> pq = new PriorityQueue<>((x,y) -> map.get(y)-map.get(x));
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray())
        {
            map.merge(c,1,(x,y)-> x+y);
        }
        
        for(char c : map.keySet())
        {
            pq.add(c);
        }
        
        while(!pq.isEmpty())
        {
            char c = pq.poll();
            
            for(int i = 0;i < map.get(c); i++)
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}