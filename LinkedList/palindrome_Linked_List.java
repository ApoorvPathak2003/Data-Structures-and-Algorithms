package LinkedList;

public class palindrome_Linked_List {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void add_first(String data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        
        new_node.next = head;
        head = new_node;
    }

    public void print_linked_list() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        
        Node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }
        
        System.out.println("NULL");
    }

    public boolean is_palindrome(palindrome_Linked_List linked_list) {
        if(head == null || head.next == null){
            return true;
        }

        Node middle = find_middle(head);
        Node second_half_start = reverse(middle.next);

        Node first_half_start = head;
        while (second_half_start != null) {
            if (first_half_start.data != second_half_start.data) {
                return false;
            }
            first_half_start = first_half_start.next;
            second_half_start = second_half_start.next;
        }

        return true;
    }

    public Node reverse(Node middle) {
        Node previous_node = null;
        Node current_node = middle;

        while (current_node != null) {
            Node next_node = current_node.next;
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = next_node; 
        }

        return previous_node;
    }

    private Node find_middle(Node head2) {
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public static void main(String[] args) {
        palindrome_Linked_List linked_list = new palindrome_Linked_List();
        linked_list.add_first("DSA");
        linked_list.add_first("Placement");
        linked_list.add_first("Placement");
        linked_list.add_first("DSA");

        System.out.print("LinkedList: ");
        linked_list.print_linked_list();

        boolean is_a_palindrome = linked_list.is_palindrome(linked_list);

        if (is_a_palindrome) {
            System.out.println("Yes, it is a palindrome.");
        }else{
            System.out.println("No, it is not a palindrome.");
        }
    }
}