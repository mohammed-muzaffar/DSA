
class minCoins {

    static int solve(int[] a, int n) {
        if (n == 0)
            return 0;
        if (n < 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, solve(a, n - a[i]));
        }
        return min + 1;
    }

    public static void main(String args[]) {
        int[] a = { 8, 6, 1 };
        int n = 15;

        System.out.println(solve(a, n));
    }
}