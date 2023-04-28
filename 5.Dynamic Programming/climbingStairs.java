public class climbingStairs {

    public static int f(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;

        int[] dp = new int[n];

        int curr = 0, prev, prev2;
        prev = 1;
        prev2 = 1;

        for (int i = 2; i <= n; i++) {
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return curr;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(climbingStairs.f(n));
    }
}