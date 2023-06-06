package LinkedList;

public class Basic_Linked_List{
    Node head;
    int linked_list_size;

    Basic_Linked_List(){
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

    // delete the first element
    public void delete_first() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        linked_list_size--;

        head = head.next;
    }

    //  delete the last element
    public void delete_last() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        linked_list_size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node second_last_node = head;
        Node last_node = head.next;

        while (last_node.next != null) {
            last_node = last_node.next;
            second_last_node = second_last_node.next;
        }

        second_last_node.next = null;
    }

    // size of the linked list
    public int get_size() {
        return linked_list_size;
    }
    public static void main(String[] args) {
        Basic_Linked_List linked_list = new Basic_Linked_List();
        linked_list.add_first("Apoorv");
        linked_list.add_first("Pathak");
        linked_list.print_linked_list();
        
        System.out.println("Size of the Linked List: " + linked_list.get_size());
        
        linked_list.add_last("Data Science Intern");
        linked_list.add_last("Zoplar");
        linked_list.print_linked_list();

        linked_list.delete_first();
        linked_list.print_linked_list();

        System.out.println("Size of the Linked List: " + linked_list.get_size());
        
        linked_list.delete_last();
        linked_list.print_linked_list();

        System.out.println("Size of the Linked List: " + linked_list.get_size());
    }
}