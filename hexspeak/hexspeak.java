class Solution {
    public String toHexspeak(String num) {
        Long n = Long.parseLong(num);
        
        boolean possible = true;
        String ans = "";
        while (n > 0) {
            int r = (int) ( n % 16l );
            n = n / 16;
            if  ( r >= 10 && r <= 15) { 
                ans = ans +  (char ) (r % 10 + 'A');
            } else if (r == 1) {
                ans = ans + 'I';
            } else if (r == 0) {
                ans = ans + 'O';
            }
            else {
                possible = false;
                break;
            }
        }
        if (possible) {
            return new StringBuilder(ans).reverse().toString();
        } else {
            return "ERROR";
        }
    }
}