import java.util.Arrays;

class UniquePaths2 {

    static int uniquePaths(int[][] maze, int i, int j, int[][] dp) {
        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (maze[i][j] == 1)
            return 0;
        dp[0][0] = 1;
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = uniquePaths(maze, i - 1, j, dp);
        int left = uniquePaths(maze, i, j - 1, dp);

        return dp[i][j] = up + left;

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 1 && n == 1) { // dp[1][1] one kind of base case
            if (obstacleGrid[m - 1][n - 1] != 1) {
                return 1;
            } else {
                return 0;
            }
        }
        int[][] dp = new int[m][n];

        if (obstacleGrid[0][0] == 1)
            return 0; // if intially [0][0] = 1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        uniquePaths(obstacleGrid, m - 1, n - 1, dp);
        if (dp[m - 1][n - 1] == -1)
            return 0; // result is -1 in dp then returning 0 else reslut
        return dp[m - 1][n - 1];
    }

    public static void main(String args[]) {
        int[][] obstacleGrid = { { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 } };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}