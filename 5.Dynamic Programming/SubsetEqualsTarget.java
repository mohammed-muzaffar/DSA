import java.util.Arrays;

public class SubsetEqualsTarget {

    public static boolean sumEqualsTarget(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0)
            return true;
        if (ind == 0)
            return (arr[0] == target);

        if (dp[ind][target] != -1)
            return dp[ind][target] == 0 ? false : true;

        boolean notTake = sumEqualsTarget(ind - 1, target, arr, dp);
        boolean take = false;

        if (arr[ind] <= target) {
            take = sumEqualsTarget(ind - 1, target - arr[ind], arr, dp);
        }

        dp[ind][target] = notTake || take ? 1 : 0;

        return notTake || take;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int target = 9;

        int[][] dp = new int[arr.length][target];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sumEqualsTarget(arr.length - 1, target, arr, dp));
    }
}