import java.util.List;
import java.util.ArrayList;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return tab(triangle);
    }

    static int rec(int i, int j, List<List<Integer>> triangle) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        if (i < 0 || j < 0) return (int) 1e9; // Casting to int

        int down = triangle.get(i).get(j) + rec(i + 1, j, triangle);
        int dia = triangle.get(i).get(j) + rec(i + 1, j + 1, triangle);

        return Math.min(down, dia);
    }

    static int mem(int i, int j, List<List<Integer>> triangle, List<List<Integer>> dp) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        if (i < 0 || j < 0) return (int) 1e9;
        if (dp.get(i).get(j) != -1) return dp.get(i).get(j);

        int down = triangle.get(i).get(j) + mem(i + 1, j, triangle, dp);
        int dia = triangle.get(i).get(j) + mem(i + 1, j + 1, triangle, dp);

        dp.get(i).set(j, Math.min(down, dia));

        return dp.get(i).get(j);
    }

    static int tab(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<List<Integer>> dp = new ArrayList<>();

        // Initialize dp with same structure as triangle
        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                dp.get(i).add(0);
            }
        }

        // Fill last row
        for (int j = 0; j < triangle.get(n - 1).size(); j++) {
            dp.get(n - 1).set(j, triangle.get(n - 1).get(j));
        }

        // Bottom-up DP calculation
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int down = triangle.get(i).get(j) + dp.get(i + 1).get(j);
                int dia = triangle.get(i).get(j) + dp.get(i + 1).get(j + 1);
                dp.get(i).set(j, Math.min(down, dia));
            }
        }
        return dp.get(0).get(0);
    }
}
