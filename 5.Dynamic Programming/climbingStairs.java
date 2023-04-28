public class climbingStairs {

    public static int f(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;

        return f(n - 1) + f(n - 2);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(climbingStairs.f(n));
    }
}