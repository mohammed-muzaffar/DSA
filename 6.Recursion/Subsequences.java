import java.util.ArrayList;

class Subsequences {

    static void solve(int[] arr, int ind, ArrayList<Integer> list) {
        if (ind >= arr.length) {
            for (int e : list) {
                System.out.print(e + " ");
            }
            if (list.size() == 0) {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }

        // take the element
        solve(arr, ind + 1, list);
        list.add(arr[ind]);

        // not take the element
        solve(arr, ind + 1, list);
        list.remove(list.size() - 1);
    }

    public static void main(String args[]) {
        int[] arr = { 3, 1, 2 };
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        solve(arr, 0, list);
    }
}