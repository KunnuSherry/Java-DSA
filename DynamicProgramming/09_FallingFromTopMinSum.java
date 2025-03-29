import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        // int n = matrix.length;
        // int[][] dp = new int[n][n]; // Memoization table
        // for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        // int minSum = Integer.MAX_VALUE;
        // for (int j = 0; j < n; j++) {
        //     minSum = Math.min(minSum, rec(n - 1, j, matrix, dp)); // Start from last row
        // }
        // return minSum;
        return tab(matrix);
    }

    static int rec(int i, int j, int[][] matrix, int[][] dp) {
        int n = matrix.length;

        // Base Case: First row reached, return its value
        if (i == 0) return matrix[i][j];

        // If out of bounds, return a large value (but not MAX_VALUE to prevent overflow)
        if (j < 0 || j >= n) return (int) 1e9; 

        // If already computed, return stored value
        if (dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        // Recursively get the minimum sum from previous rows
        int up = matrix[i][j] + rec(i - 1, j, matrix, dp);
        int upLeft = matrix[i][j] + (j > 0 ? rec(i - 1, j - 1, matrix, dp) : (int) 1e9);
        int upRight = matrix[i][j] + (j < n - 1 ? rec(i - 1, j + 1, matrix, dp) : (int) 1e9);

        // Store result in DP table
        return dp[i][j] = Math.min(up, Math.min(upLeft, upRight));
    }

    static int tab(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        // Initialize first row with matrix values
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Iterate from the second row to the last row
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int down = matrix[i][j] + dp[i - 1][j]; // From top to bottom
                int leftDiagonal = (j > 0) ? matrix[i][j] + dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < m - 1) ? matrix[i][j] + dp[i - 1][j + 1] : Integer.MAX_VALUE;

                // Store the minimum sum at dp[i][j]
                dp[i][j] = Math.min(down, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Get the minimum from the last row
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minSum = Math.min(minSum, dp[n - 1][j]);
        }
        return minSum;
    }
}
