package Queue;

public class Queue_Linked_List {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null & tail == null;
        }

        public void add(int value) {
            Node new_node = new Node(value);

            if (tail == null) {
                tail = head = new_node;
                return;
            }

            tail.next = new_node;
            tail = new_node;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }

            int remove_element = head.data;

            if (head == tail) {
                tail = null;
            }

            head = head.next;

            return remove_element;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }
            
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue que_array = new Queue();

        que_array.add(10);
        que_array.add(104);
        que_array.add(115);
        que_array.add(150);
        que_array.add(100);

        System.out.println("Initial Queue: ");
        while (!que_array.isEmpty()) {
            System.out.print(que_array.peek() + " ");
            que_array.remove();
        }
    }
}