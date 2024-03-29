import java.util.Arrays;

public class MaxSumNonAdjacentElements {

    public static int solve(int ind, int[] arr, int[] dp) {

        if (ind < 0)
            return 0;
        if (ind == 0)
            return arr[ind];
        if (dp[ind] != -1)
            return dp[ind];
        int pick = arr[ind] + solve(ind - 2, arr, dp);
        int nonPick = 0 + solve(ind - 1, arr, dp);

        return dp[ind] = Math.max(pick, nonPick);

    }

    public static void main(String args[]) {

        int arr[] = { 2, 1, 4, 9 };
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.print(solve(n - 1, arr, dp));
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}