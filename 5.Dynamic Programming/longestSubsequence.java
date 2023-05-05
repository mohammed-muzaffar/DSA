public class longestSubsequence {

    static int longestCommonSubsequence(String str1, String str2, int n, int m) {

        if (n == 0 || m == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return 1 + longestCommonSubsequence(str1, str2, n - 1, m - 1);
        } else {
            return Math.max(longestCommonSubsequence(str1, str2, n - 1, m),
                    longestCommonSubsequence(str1, str2, n, m - 1));
        }
    }

    public static void main(String args[]) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        int n = str1.length();
        int m = str2.length();
        System.out.println(longestCommonSubsequence(str1, str2, n, m));
    }
}