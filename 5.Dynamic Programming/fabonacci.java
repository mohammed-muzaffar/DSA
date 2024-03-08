import java.util.*;

class fabonacci {

    static int f(int n, int[] dp) {
        if (n <= 1)
            return n;

        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }

    public static void main(String args[]) {
        int n = 5;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);
        System.out.println(f(n, dp));
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}