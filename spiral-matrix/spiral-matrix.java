class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        
        int up,down,left,right;
        
        up = 0;
        left = 0;
        right = matrix[0].length;
        down = matrix.length;
        
        
        while(up < down && left < right){
            for(int i = left; i < right; i++){
                result.add(matrix[up][i]);
            }
            up++;
            
            for(int i = up; i< down; i++){
                result.add(matrix[i][right-1]);
            }
            right--;
            
            if(up < down){
                for(int i = right-1; i >= left; i--){
                    result.add(matrix[down-1][i]);
                }
                down--;
            }
            
            if(left < right){
                for(int i = down-1; i >= up; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}