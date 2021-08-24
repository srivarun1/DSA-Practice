class Solution {
    
    int rightptr = 1;
    //((())())
     int compute(String inp, int idx) {
        char c = inp.charAt(idx+1);
        if (c == ')') {
            rightptr++;
            return 1;
        }
        int ans = 0;
        while (inp.charAt(rightptr) != ')') {
            rightptr++;
            ans = ans + 2 * compute(inp, rightptr-1);
        }
        rightptr++;
        return ans;
    }

    public int scoreOfParentheses(String inp) {
        int ans = 0;
        ans += compute(inp, 0);
        while (rightptr < inp.length()) {
            rightptr++;
            ans += compute(inp, rightptr-1);
        }
        return ans;
    }
   
}