class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        // return rec(r-1,c-1,obstacleGrid);
        int[][] dp = new int[r][c];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return mem(r-1,c-1,obstacleGrid,dp);
        // return tab(obstacleGrid);
    }
    static int rec(int i, int j, int[][]grid){
        if(i==0 && j<0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(i>=0 && j>=0 && grid[i][j]==1){
            return 0;
        }
        int up = rec(i-1, j, grid);
        int left = rec(i, j-1, grid);
        return up+left;
    }
    static int mem(int i, int j, int[][]grid, int[][]dp){
        if(i==0 && j<0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(i>=0 && j>=0 && grid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = mem(i-1, j, grid, dp);
        int left = mem(i, j-1, grid, dp);
        return dp[i][j]=up+left;
    }
    static int tab(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {  // If there's an obstacle, no path possible
                    dp[i][j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {  // Start position
                    dp[i][j] = 1;
                    continue;
                }

                int up = (i > 0) ? dp[i - 1][j] : 0;
                int left = (j > 0) ? dp[i][j - 1] : 0;

                dp[i][j] = up + left;
            }
        }
        return dp[r - 1][c - 1];  // Return paths to bottom-right corner
}

}