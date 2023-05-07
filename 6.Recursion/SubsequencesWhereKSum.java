import java.util.ArrayList;

class SubsequencesWhereKSum {

    static void solve(int[] arr, int ind, int sum, ArrayList<Integer> list, int res) {
        if (ind == arr.length) {
            if (res == sum) {
                for (int e : list) {
                    System.out.print(e + " ");
                }
                System.out.println();
            }
            return;
        }

        list.add(arr[ind]);
        res = res + arr[ind];
        solve(arr, ind + 1, sum, list, res);

        res = res - arr[ind];
        list.remove(list.size() - 1);
        solve(arr, ind + 1, sum, list, res);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
        solve(arr, 0, sum, list, res);
    }
}