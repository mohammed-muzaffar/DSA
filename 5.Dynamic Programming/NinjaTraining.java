import java.util.Arrays;

class NinjaTraining {

    static int solve(int[][] points, int day, int last, int[][] dp) {
        if (day == 0) {
            int maxi = Integer.MIN_VALUE;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }

        if (dp[day][last] != -1)
            return dp[day][last];

        int maxi = Integer.MIN_VALUE;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int activites = points[day][task] + solve(points, day - 1, task, dp);
                maxi = Math.max(maxi, activites);
            }
        }
        return dp[day][last] = maxi;
    }

    public static void main(String args[]) {
        int[][] points = { { 10, 40, 70 },
                { 20, 50, 80 },
                { 30, 60, 90 } };
        int n = points.length;
        int[][] dp = new int[n][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(solve(points, n - 1, 3, dp));
    }
}
