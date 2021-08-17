class Solution {
    private String printS;
    private String printP;
    
    private char[] s;
    private char[] p;
    private int slen;
    private int plen;
    
    private boolean isChar(char c) {
        return c >= 'a' && c <= 'z';
    }
    
    private boolean f(int sidx, int pidx) {
       // System.out.println(printS.substring(0, sidx)  + " and " + printP.substring(0, pidx));
        
     //   System.out.println(sidx + " and " + pidx);
        if (sidx == slen && pidx == plen) {
            return true;
        } else if (sidx == slen && pidx < plen) {
            //is epsilon pattern
            if (pidx == plen-1) {
                return false;
            }
            if ((plen - pidx) % 2 != 0) { //even length 
                return false;
            }
            boolean emptiable = true;;
            for (int i = pidx+1; i <= plen-1; i += 2) {
                emptiable = emptiable && (p[i] == '*');
            }
            return emptiable;
            
        } else if (sidx < slen && pidx == plen) {
            return false;
        }
        
        // x*
        // x.
        // xb*
        // xb.
        // .*
        
        if (pidx + 1 == plen) {
            char c = p[pidx];
            if (c == '.') {
                return f(sidx+1, pidx+1); 
            } else {
                if (s[sidx] == p[pidx]) {
                    return f(sidx+1, pidx+1);
                } else {
                    return false;
                }
            }
        }
        
        boolean ans = false;
        
        char u = p[pidx];
        char v = p[pidx+1];
        if (isChar(u) && isChar(v)) {
            //try matching and move pointer
            if (s[sidx] == p[pidx]) {
                ans = f(sidx+1, pidx+1);
            }
            
        } else if (isChar(u) && v == '*') {
            ans = f(sidx, pidx+2);
            for (int i = sidx; i <= slen-1; ++i) {
                if (s[i] != u) {
                    break;
                }
                ans = ans || f(i+1, pidx+2);
            }

        } else if (isChar(u) && v == '.') {
            if (s[sidx] == p[pidx]) {
                ans = f(sidx+1, pidx+1);
            }
        }
        else if (u == '.' && v == '*') {
            ans = f(sidx, pidx+2);
            for (int i = sidx; i <= slen-1; ++i) {
                ans = ans || f(i+1, pidx+2);
            }
        } else if (u == '.') {
            ans = f(sidx+1, pidx+1);
        }
        return ans;
        
        
    }
    
    
    public boolean isMatch(String st, String pt) {
        printS = st;
        printP = pt;
        s = st.toCharArray();
        p = pt.toCharArray();
        slen = st.length();
        plen = pt.length();
        return f(0, 0);
    }
}