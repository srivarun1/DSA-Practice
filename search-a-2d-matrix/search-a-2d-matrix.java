class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int y = matrix[0].length-1;
        int x = 0;
        
        while( x < matrix.length && y >= 0)
        {
            if(target == matrix[x][y]) return true;
            else if(target > matrix[x][y])  x++;
            else y--;
        }
        return false;
    }
}