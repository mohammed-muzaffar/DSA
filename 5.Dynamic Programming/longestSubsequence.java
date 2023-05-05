import java.util.Arrays;

public class longestSubsequence {

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

        return lcs(text1, text2, m, n, dp);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "def";

        System.out.println(longestCommonSubsequence(str1, str2));
    }
}