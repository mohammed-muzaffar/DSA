import java.util.Arrays;

class rodCutting {

    static int rodCuttingDP(int[] price, int n, int[] dp) {
        if (dp[n] != -1) {
            return dp[n];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, price[i] + rodCuttingDP(price, n - i - 1, dp));
        }
        return dp[n] = max;
    }

    public static void main(String args[]) {
        int[] price = { 3, 6, 10, 15, 13 };
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(rodCuttingDP(price, n, dp));
    }
}