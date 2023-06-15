public class Basic_Stack_Linked_List {
    static class Node {
        int data;
        Node next;
        public Node(int value){
            this.data = value;
            next = null;
        }
    }
    static class Stack{
        Node head;
        
        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public void push(int data) {
            Node add_new_node = new Node(data);

            if (isEmpty()) {
                head = add_new_node;
                return;
            }

            add_new_node.next = head;
            head = add_new_node;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("The Linked List is empty.");
                return -1;
            }

            int top_element = head.data;
            head = head.next;
            return top_element;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The Linked List is empty.");
                return -1;
            }
            System.err.println("The peeked element: " + head.data);
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stack_linked_list = new Stack();

        stack_linked_list.push(0);
        stack_linked_list.push(1);
        stack_linked_list.push(10);
        stack_linked_list.push(100);

        while (!stack_linked_list.isEmpty()) {
            stack_linked_list.peek();
            stack_linked_list.pop();
        }
    }
}