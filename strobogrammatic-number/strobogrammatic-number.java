class Solution {
    public boolean isStrobogrammatic(String num) {
        char[] arr = num.toCharArray();
        
        int i = 0, j = num.length()-1;
        
        
            while(i <= j)
            {
                if(arr[i] == '6' && arr[j] =='9' || arr[i] == '9' && arr[j] =='6' || arr[i] == '8' && arr[j] =='8' || arr[i] == '1' && arr[j] =='1'  || arr[i] == '0' && arr[j] =='0') {
                    i++;
                j--;
                }
                else
                {
                    return false;
                }
                
            }
        return true;
    }
}