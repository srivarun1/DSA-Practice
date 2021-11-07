class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> xPoints = new HashSet();
        Set<Integer> yPoints = new HashSet();
        
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ;j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    xPoints.add(i);
                    yPoints.add(j);
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ;j < matrix[0].length; j++){
                if(xPoints.contains(i) || yPoints.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}