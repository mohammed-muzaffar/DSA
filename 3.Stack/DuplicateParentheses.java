import java.util.Stack;

public class DuplicateParentheses {

    public static boolean duplicate(String str) {

        Stack<Character> s = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char x = str.charAt(i);
            if (x == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "((a+b) +((c)))";
        String str = "((a+b)+ (a+b))";
        System.out.println(duplicate(str));
    }
}
