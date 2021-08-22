import java.util.*;
import java.io.*;

class Solution {
    
    
    
    public int minTotalDistance(int[][] grid) {
        List<Integer> xs = new ArrayList<Integer>();
        List<Integer> ys = new ArrayList<Integer>();
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] == 1) {
                    xs.add(i);
                    ys.add(j);
                }
            }
        }
        int medianX = xs.get(xs.size()/2);
        int dist = 0;
        for (int point: xs) {
            dist += Math.abs(point - medianX);
        }
        Collections.sort(ys);
        int medianY = ys.get(ys.size()/2);
        for (int point: ys) {
            dist += Math.abs(point - medianY);
        }
        return dist;
        
    }
}