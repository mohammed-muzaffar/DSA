import java.util.Stack;

class StackB {

    static void insertAtBottom(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
        } else {
            int x = s.peek();
            s.pop();
            insertAtBottom(s, top);
            s.push(x);
        }
    }

    static void Reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            int top = s.pop();
            Reverse(s);
            insertAtBottom(s, top);
        }
    }

    static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        Reverse(s);
        printStack(s);
    }
}