import java.util.Stack;

public class ValidParentheses {

    public static boolean valid(String str) {
        int n = str.length();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            char x = str.charAt(i);
            if (x == '[' || x == '{' || x == '(') {
                s.push(str.charAt(i));
            } else {
                char c = str.charAt(i);
                char check;
                switch (c) {
                    case '}':
                        check = s.pop();
                        if (check == ']' || check == ')') {
                            return false;
                        }
                        break;

                    case ']':
                        check = s.pop();
                        if (check == ')' || check == '}') {
                            return false;
                        }
                        break;

                    case ')':
                        check = s.pop();
                        if (check == '}' || check == ')') {
                            return false;
                        }
                        break;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(]";
        System.out.println(ValidParentheses.valid(str));
    }
}