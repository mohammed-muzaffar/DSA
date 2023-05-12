import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        function(s, res, path, 0);
        return res;
    }

    public static void function(String s, List<List<String>> res, List<String> path, int ind) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            if (palindrome(i, ind, s)) {
                path.add(s.substring(ind, i + 1));
                function(s, res, path, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public static boolean palindrome(int end, int start, String s) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "aabb";
        System.out.println(partition(str));
    }
}