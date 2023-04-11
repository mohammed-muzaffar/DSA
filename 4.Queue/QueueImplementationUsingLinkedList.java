import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class QueueImplementationUsingLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {

        static Node head = null;
        static Node tail = null;

        // sEmpty
        public static boolean isEmpty() {
            return (head == null && tail == null);
        }

        // add
        public static void add(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int res = head.data;
            if (head == tail) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return res;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}