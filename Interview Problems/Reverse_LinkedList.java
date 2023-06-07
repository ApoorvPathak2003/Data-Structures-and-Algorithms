import java.util.HexFormat;

public class Reverse_LinkedList {
    Node head;
    int linked_list_size;
    
    Reverse_LinkedList(){
        this.linked_list_size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            linked_list_size++;
        }
    }
    
    // add at first position
    public void add_first(String data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        
        new_node.next = head;
        head = new_node;
    }

    // add at last position
    public void add_last(String data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }

        Node current_node = head;
        while (current_node.next != null) {
            current_node = current_node.next;
        }
        
        current_node.next = new_node;
    }
    
    // printing the linked list
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

    public Node reverse_linkedlist_recursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node new_head = reverse_linkedlist_recursive(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }
       
    // reverse the linked list
    public void reverse_linkedlist_iterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node previous_node = head;
        Node current_node = head.next;

        while (current_node != null) {
            Node next_node = current_node.next;

            // crucial to understand the chronology of the below 3 lines
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = next_node;
        }

        head.next = null;
        head = previous_node;
    }
    public static void main(String[] args) {
        Reverse_LinkedList linked_list = new Reverse_LinkedList();
        
        linked_list.add_first("Pathak");
        linked_list.add_first("Apoorv");
        linked_list.add_first("am");
        linked_list.add_first("I");
        System.out.println("Actual Linked-List:");
        linked_list.print_linked_list();
        
        linked_list.reverse_linkedlist_iterative();
        
        System.out.println("After reversing the Linked-List using Iterative approach:");
        linked_list.print_linked_list();

        System.out.println("Reversing the Linked-List using Recursive approach:");
        linked_list.head = linked_list.reverse_linkedlist_recursive(linked_list.head);
        linked_list.print_linked_list();
    }
}