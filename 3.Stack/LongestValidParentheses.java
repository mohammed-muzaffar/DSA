import java.util.Stack;

public class LongestValidParentheses {

    public static int validParentheses(String s, int n) {

        Stack<Character> letter = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int len = 0;
        index.add(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                letter.add('(');
                index.add(i);

            } else {
                if (!letter.isEmpty() && letter.peek() == '(') {
                    letter.pop();
                    index.pop();
                    len = Math.max(len, i - index.peek());
                } else {
                    index.add(i);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String str = ")()())";
        int n = str.length();

        System.out.println(validParentheses(str, n));

    }
}