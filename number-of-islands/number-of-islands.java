class Solution {
    public int numIslands(char[][] grid) {
        char marker = '2';
        int count = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    mark(grid,i,j,marker);
                    count++;
                }
            }
        }
        return count;
        
    }
    
    
    public void mark(char[][] grid, int i , int j, int marker){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1'){
            return;
        }
        
        grid[i][j] = (char)marker;
        //System.out.println(i + " " + j + " " + grid[i][j]);
        
        mark(grid,i+1,j,marker);
        mark(grid,i-1,j,marker);
        mark(grid,i,j+1,marker);
        mark(grid,i,j-1,marker);
    }
}