public class QueueImplementationUsingArray {

    static class Queue {
        static int rear;
        static int arr[];
        static int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty()
        public static boolean isEmpty() {
            return (rear == -1);
        }

        // add()
        public static void add(int n) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
            }
            rear = rear + 1;
            arr[rear] = n;
        }

        // remove()
        public static int remove() {
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek()
        public static int peek() {
            int front = arr[0];
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}