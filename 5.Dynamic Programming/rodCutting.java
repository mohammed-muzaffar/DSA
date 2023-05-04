class rodCutting {

    static int rodCuttingDP(int[] price, int n) {
        if (n == 0)
            return 0;

        if (n < 0)
            return -10000;

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, price[i] + rodCuttingDP(price, n - i - 1));
        }
        return max;
    }

    public static void main(String args[]) {
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };

        int n = 8;
        System.out.println(rodCuttingDP(price, n));
    }
}