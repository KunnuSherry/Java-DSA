public class Solution {
    public static int ninjaTraining(int n, int points[][]) {
        // return recurssion(n-1, points, 3);
        int[][] dp = new int[n][4];
        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                dp[i][j] = -1;
            }
        }
        return memoization(n-1, points, 3, dp);
    }
    static int recurssion(int days, int[][] points, int t){
        if(days==0){
            if(t==0) return (int)Math.max(points[0][1],points[0][2]);
            if(t==1) return (int)Math.max(points[0][0],points[0][2]);
            if(t==2) return (int)Math.max(points[0][0],points[0][1]);
            if(t==3) return (int)Math.max(Math.max(points[0][0],points[0][1]),points[0][2]);
        }
        int maxi = 0;
        for(int i=0; i<3; i++){
            if(i!=t){
                int point = points[days][i] + recurssion(days-1, points, i);
                maxi = (int)Math.max(maxi, point);
            }
        }
        return maxi;

    }
    static int memoization(int days, int[][] points, int t, int[][] dp){
        if(days==0){
            if(t==0) return (int)Math.max(points[0][1],points[0][2]);
            if(t==1) return (int)Math.max(points[0][0],points[0][2]);
            if(t==2) return (int)Math.max(points[0][0],points[0][1]);
            if(t==3) return (int)Math.max(Math.max(points[0][0],points[0][1]),points[0][2]);
        }
        if(dp[days][t]!=-1) return dp[days][t];
        int maxi = 0;
        for(int i=0; i<3; i++){
            if(i!=t){
                int point = points[days][i] + memoization(days-1, points, i, dp);
                maxi = (int)Math.max(maxi, point);
            }
        }
        return dp[days][t] = maxi;

    }
    static int tabular(int days, int[][] points, int[][] dp) {
        // Base case: Fill dp for the first day
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(Math.max(points[0][0], points[0][1]), points[0][2]);

        // Fill the DP table iteratively
        for (int i = 1; i < days; i++) {
            for (int j = 0; j < 4; j++) {
                int maxi = 0;
                for (int k = 0; k < 3; k++) {
                    if (k != j) {  // Ensure different tasks on consecutive days
                        int point = points[i][k] + dp[i - 1][k];
                        maxi = Math.max(maxi, point);
                    }
                }
                dp[i][j] = maxi;
            }
        }

        // The result is the max value on the last day
        return dp[days - 1][3];
    }


}