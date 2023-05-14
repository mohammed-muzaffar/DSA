import java.util.Arrays;

public class UniquePaths {

    public static int paths(int i, int j, int[][] dp) {
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = paths(i - 1, j, dp);
        int left = paths(i, j - 1, dp);
        return dp[i][j] = up + left;
    }

    public static void main(String args[]) {
        int m = 3;
        int n = 7;
        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        paths(m - 1, n - 1, dp);
        System.out.println(dp[m - 1][n - 1]);
    }
}
