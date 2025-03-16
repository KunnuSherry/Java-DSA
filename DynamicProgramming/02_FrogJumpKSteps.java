// In the previous question, the frog was allowed to jump either one or two steps at a time. In this question, the frog is allowed to jump up to ‘K’ steps at a time. If K=4, the frog can jump 1,2,3, or 4 steps at every index.


// Reccursion Code

public class Solution {
    public static int minimizeCost(int n, int k, int[] height) {
        if (n == 1) return 0;
        
        int mm = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 1) {
                int fs = minimizeCost(n - i, k, height) + Math.abs(height[n - 1] - height[n - i - 1]);
                mm = Math.min(fs, mm);
            }
        }
        return mm;
    }
}

//memoization code
import java.util.Arrays;

public class Solution1 {
    public static int minimizeCost(int n, int k, int[] height) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memoization(n, k, height, dp);
    }

    static int memoization(int n, int k, int[] height, int[] dp) {
        if (n == 1) return 0;
        if (dp[n] != -1) return dp[n];

        int mm = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 1) {
                int fs = memoization(n - i, k, height, dp) + 
                         Math.abs(height[n - 1] - height[n - i - 1]);
                mm = Math.min(fs, mm);
            }
        }
        return dp[n] = mm;
    }
}

//Tabular form
import java.util.Arrays;

public class Solution3 {
    public static int minimizeCost(int n, int k, int[] height) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0; // Starting point with zero cost

        // Loop through each stone starting from index 1
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    dp[i] = Math.min(dp[i], jump);
                }
            }
        }

        return dp[n - 1]; // The result is stored at the last index
    }
}
