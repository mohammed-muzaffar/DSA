import java.util.Arrays;

public class MinSumTriangle {

    static int minimumPathSumUtil(int[][] triangle, int n, int i, int j, int[][] dp) {
        if (i == n - 1)
            return triangle[i][j];
        if (dp[i][j] != -1)
            return dp[i][j];

        int down = triangle[i][j] + minimumPathSumUtil(triangle, n, i + 1, j, dp);
        int diagonal = triangle[i][j] + minimumPathSumUtil(triangle, n, i + 1, j + 1, dp);

        return Math.min(down, diagonal);
    }

    static int minimumPathSum(int[][] triangle, int n) {
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minimumPathSumUtil(triangle, n, 0, 0, dp);
    }

    public static void main(String args[]) {

        int triangle[][] = { { 1 },
                { 2, 3 },
                { 3, 6, 7 },
                { 8, 9, 6, 10 } };

        int n = triangle.length;

        System.out.println(minimumPathSum(triangle, n));
    }
}