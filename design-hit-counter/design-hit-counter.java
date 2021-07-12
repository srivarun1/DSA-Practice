class HitCounter {

    
    Queue<Integer> hitQueue;
    /** Initialize your data structure here. */
    public HitCounter() {
        hitQueue = new LinkedList();
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        hitQueue.add(timestamp);
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while(!hitQueue.isEmpty())
        {
            int diff = timestamp - hitQueue.peek();
            if(diff >= 300)
            {
                hitQueue.poll();
            }
            else
            {
                break;
            }
        }
        return hitQueue.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */