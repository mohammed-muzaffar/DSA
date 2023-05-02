import java.util.Arrays;

class frogJump {

    static int solve(int n, int[] heights, int[] dp) {
        if (n == 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        int jumpOne = solve(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (n > 1) {
            jumpTwo = solve(n - 2, heights, dp) + Math.abs(heights[n] - Math.abs(heights[n - 2]));
        }
        return Math.min(jumpOne, jumpTwo);
    }

    public static void main(String args[]) {
        int[] heights = { 30, 10, 60, 10, 60, 50 };
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(n - 1, heights, dp));

    }
}