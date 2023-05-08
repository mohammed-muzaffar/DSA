import java.util.Arrays;

class Solution {
    public static int lcs(String text1, String text2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m - 1][n - 1] != -1)
            return dp[m - 1][n - 1];

        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
            return dp[m - 1][n - 1] = 1 + lcs(text1, text2, m - 1, n - 1, dp);
        } else {
            return dp[m - 1][n - 1] = Math.max(lcs(text1, text2, m - 1, n, dp), lcs(text1, text2, m, n - 1, dp));
        }
    }

    public static int minOperations(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int lcsAns = lcs(str1, str2, m, n, dp);

        return m + n - 2 * lcsAns;
        // Your code goes here
    }

    public static void main(String args[]) {
        String str1 = "heap";
        String str2 = "pea";

        System.out.println(Solution.minOperations(str1, str2));
    }
}