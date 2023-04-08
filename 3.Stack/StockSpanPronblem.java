import java.util.Stack;

class Solution {

    public static int[] calculateSpan(int price[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];

        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            int currPrice = price[i];
            while (!st.isEmpty() && currPrice >= price[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = st.peek();
                span[i] = i - prevHigh;
            }

            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 85, 100 };
        int n = price.length;
        calculateSpan(price, n);
    }

}