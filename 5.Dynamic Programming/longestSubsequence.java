import java.util.Arrays;

public class longestSubsequence {

    // tabulation format
    public static int lcsTabular(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; i <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];

    }

    // memoization
    public static int lcs(String text1, String text2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m - 1][n - 1] != -1)
            return dp[m][n];

        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
            return dp[m - 1][n - 1] = 1 + lcs(text1, text2, m - 1, n - 1, dp);
        } else {
            return dp[m - 1][n - 1] = Math.max(lcs(text1, text2, m - 1, n, dp), lcs(text1, text2, m, n - 1, dp));
        }

    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = lcs(text1, text2, m, n, dp);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String args[]) {
        String str1 = "abcde";
        String str2 = "ace";

        System.out.println(lcsTabular(str1, str2));

    }
}