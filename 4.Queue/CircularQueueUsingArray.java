class CircularQueueUsingArray {

    public static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;
        }

        // isEmpty()

        public static boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        // isfull

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int res = arr[front];

            // last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            int res = arr[front];
            return res;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}