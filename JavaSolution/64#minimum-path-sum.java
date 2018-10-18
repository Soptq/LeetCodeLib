//https://leetcode.com/problems/minimum-path-sum/submissions/

class Solution {
    int m,n;
    int[][] data;
    public int minPathSum(int[][] grid) {
        m = grid.length;
        if (m == 0) return 0;
        n = grid[0].length;
        data = grid;
        return findMin(m - 1, n - 1);
    }
    
    public int findMin(int i,int j){
        if (i == 0 && j == 0) return data[0][0];
        if (i == 0) return data[i][j] + findMin(i,j-1);
        if (j == 0) return data[i][j] + findMin(i-1,j);
        return data[i][j] + Math.min(findMin(i,j-1),findMin(i-1,j));
    }
}

class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 1;i < grid.length;i++){
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }
        for (int j = 1;j < grid[0].length;j++){
            grid[0][j] = grid[0][j-1] + grid[0][j];
        }
        for (int i = 1;i < grid.length;i++){
            for (int j = 1;j < grid[0].length;j++){
                grid[i][j] = Math.min(grid[i][j-1] + grid[i][j],grid[i-1][j] + grid[i][j]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}