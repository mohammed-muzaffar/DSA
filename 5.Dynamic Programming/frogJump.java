import java.util.Arrays;

class frogJump {

    static int solve(int n, int[] heights) {
        if (n == 0)
            return n;
        int prev = 0;
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int jumpOne = prev + Math.abs(heights[n] - heights[n - 1]);
            int jumpTwo = Integer.MAX_VALUE;
            if (n > 1) {
                jumpTwo = prev + Math.abs(heights[n] + heights[n - 2]);
            }

            int cur = Math.min(jumpOne, jumpTwo);
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }

    public static void main(String args[]) {
        int[] heights = { 10, 20, 30, 10 };
        int n = heights.length;
        System.out.println(solve(n - 1, heights));

    }
}