import java.util.Arrays;

public class HouseRobberI {

    static int solve(int[] nums, int ind, int[] dp) {
        if (ind == 0)
            return nums[ind];

        if (ind < 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int pick = nums[ind] + solve(nums, ind - 2, dp);
        int notPick = 0 + solve(nums, ind - 1, dp);

        return dp[ind] = Math.max(pick, notPick);
    }

    public static void main(String args[]) {

        int[] nums = { 2, 1, 4, 9 };
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(nums, n - 1, dp));

    }
}