class Solution {
    public int uniquePaths(int m, int n) {
        // // return rec(m-1, n-1);
        // int[][] dp = new int[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // return mem(m-1, n-1, dp);
        return tab(m, n);
    }
    static int rec(int i, int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int up = rec(i-1, j);
        int left = rec(i, j-1);
        return up+left;
    }
    static int mem(int i, int j, int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = rec(i-1, j);
        int left = rec(i, j-1);
        return dp[i][j] = up+left;
    }
        static int tab(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1; // First row and first column should be 1
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // Move up + Move left
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}