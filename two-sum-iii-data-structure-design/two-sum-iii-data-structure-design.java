class TwoSum {

    Map<Integer,Integer> map;
    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        map.merge(number,1,(x,y) -> x+y);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int key : map.keySet())
        {
            int compliment = value - key;
            
            if(compliment != key)
            {
                if(map.containsKey(compliment)) return true;
            }
            else if(map.get(key) > 1)
            {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */