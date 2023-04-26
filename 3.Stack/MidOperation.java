public class MidOperation {

    static class DLLNode {
        DLLNode prev;
        DLLNode next;
        int data;

        DLLNode(int data) {
            this.data = data;
        }
    }

    public class myStack {
        DLLNode head;
        DLLNode mid;
        DLLNode prev;
        DLLNode next;
        int size;

        public void push(int data) {
            DLLNode newNode = new DLLNode(data);

            if (size == 0) {
                head = newNode;
                mid = newNode;
                size++;
                return;
            }

            
        }
    }

    

    public static void main(String[] args) {

    }
}