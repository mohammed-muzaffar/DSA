import java.util.LinkedList;
import java.util.Queue;

public class RevFirstKeleQueue {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();
        Queue<Integer> res = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            res.add(st.pop());
        }

        while (!q.isEmpty()) {
            res.add(q.remove());
        }

        return res;
    }

    public static void main(String[] args) {
        RevFirstKeleQueue obj = new RevFirstKeleQueue();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        obj.modifyQueue(q, 3);

    }
}