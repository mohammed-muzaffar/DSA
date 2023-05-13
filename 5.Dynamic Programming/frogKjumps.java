import java.util.Arrays;

public class frogKjumps {

    public static int energy(int[] heights, int k, int ind, int[] dp) {
        if (ind == 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {

            if (ind - i >= 0) {
                int jump = energy(heights, k, ind - i, dp) + Math.abs(heights[ind] - heights[ind - i]);
                min = Math.min(min, jump);
            }

        }

        return dp[ind] = min;
    }

    public static void main(String args[]) {
        int[] heights = { 30, 10, 60, 10, 60, 50 };
        int k = 2;
        int n = heights.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(energy(heights, k, n - 1, dp));
        for (int i = 0; i < n; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}