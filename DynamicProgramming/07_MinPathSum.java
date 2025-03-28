class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        // return rec(r-1, c-1, grid);
        int[][] dp = new int[r][c];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        // return mem(r-1,c-1, grid, dp);
        return tab(grid);
    }
    static int rec(int i, int j, int[][] grid){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return (int) 1e9;
        int up = grid[i][j] + rec(i-1, j, grid);
        int left = grid[i][j] + rec(i, j-1, grid);
        return Math.min(up, left);
    }
    static int mem(int i, int j, int[][] grid, int[][] dp){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return (int) 1e9;
        if (dp[i][j]!=-1) return dp[i][j];
        int up = grid[i][j] + rec(i-1, j, grid);
        int left = grid[i][j] + rec(i, j-1, grid);
        return dp[i][j]=Math.min(up, left);
    }
    static int tab(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] dp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];  // Base case
                } else {
                    int up = (i > 0) ? dp[i-1][j] : Integer.MAX_VALUE;
                    int left = (j > 0) ? dp[i][j-1] : Integer.MAX_VALUE;
                    dp[i][j] = grid[i][j] + Math.min(up, left);
                }
            }
        }
        return dp[r-1][c-1]; // Minimum path sum to bottom-right
}

}