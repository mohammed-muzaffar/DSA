import java.util.Arrays;

public class JumpGame2 {

    public static int jumpGame(int[] nums, int idx, int[] dp) {

        if (idx == nums.length - 1)
            return dp[idx] = 0;

        if (dp[idx] != -1)
            return dp[idx];
        int min = Integer.MAX_VALUE;
        for (int j = idx + 1; j < nums.length && j <= idx + nums[idx]; j++) {
            int jumps = 1 + jumpGame(nums, j, dp);
            min = Math.min(min, jumps);
        }
        return dp[idx] = min;

    }

    public static void main(String args[]) {
        int[] nums = { 2, 3, 1, 1, 4 };
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.println(jumpGame(nums, 0, dp));
    }
}