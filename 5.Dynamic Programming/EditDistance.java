import java.util.Arrays;

class editDistance {

    public static int operations(String word1, String word2, int i, int j, int[][] dp) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = 0 + operations(word1, word2, i - 1, j - 1, dp);
        } else {
            // Math.min(operation(replace), Math.min(operation(insert), operation(delete)));
            dp[i][j] = 1 + Math.min(operations(word1, word2, i - 1, j - 1, dp),
                    Math.min(operations(word1, word2, i, j - 1, dp), operations(word1, word2, i - 1, j, dp)));
        }
        return dp[i][j];

    }

    public static void main(String args[]) {
        String str1 = "horse";
        String str2 = "ros";

        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(operations(str1, str2, m - 1, n - 1, dp));
    }
}