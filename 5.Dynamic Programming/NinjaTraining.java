
class NinjaTraining {

    static int solve(int[][] points, int day, int last) {

        if (day == 0) {
            int maxi = Integer.MIN_VALUE;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }
        int maxi = Integer.MIN_VALUE;

        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int activites = points[day][task] + solve(points, day - 1, task);
                maxi = Math.max(maxi, activites);
            }

        }
        return maxi;

    }

    public static void main(String args[]) {
        int[][] points = { { 10, 40, 70 },
                { 20, 50, 80 },
                { 30, 60, 90 } };

        int n = points.length;
        System.out.println(solve(points, n - 1, 3));
    }
}