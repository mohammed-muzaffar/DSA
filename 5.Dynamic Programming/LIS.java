public class LIS {

    public static int lengthofLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int e : dp) {
            max = Math.max(max, e);
        }
        return max;
    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 2, 3 };
        System.out.println(lengthofLIS(nums));
    }
}