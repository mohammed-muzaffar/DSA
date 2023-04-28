public class climbingStairs {

    public static int f(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(climbingStairs.f(n));
    }
}