class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack();
        int[] ret = new int[t.length];
        ret[t.length-1]=0;
        stack.push(t.length-1);
        
        for(int i = t.length-2; i >= 0 ; i--)
        {
            while(!stack.isEmpty() && t[i] >= t[stack.peek()])
            {
                stack.pop();
            }
            
            if(stack.size() > 0)
            {
                ret[i] = stack.peek()-i;
            }
            else
            {
                ret[i] = 0;
            }
            stack.push(i);
        }
        
        return ret;
    }
}