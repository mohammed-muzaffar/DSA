import java.util.Arrays;

public class longestSubsequence {

    // tabulation format
    static int lcsTabular(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                else
                    dp[ind1][ind2] = 0 + Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
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

        // System.out.println(lcsTabular(str1, str2));
        System.out.println(longestCommonSubsequence(str1, str2));

    }
}