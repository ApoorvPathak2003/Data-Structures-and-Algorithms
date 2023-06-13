package LinkedList;

import java.util.Scanner;

public class nth_node_last {   
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

    public void remove_nth_node(nth_node_last linked_list, int n) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        int size = 0;

        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        if (n == size) {
            Node current_node = head.next;
            while (current_node != null) {
                System.out.print(current_node.data + " -> ");
                current_node = current_node.next;
            }
            
            System.out.println("NULL");
            return;
        }

        int search_index = size - n;
        Node previous_node = head;
        int i = 1;

        while (i < search_index) {
            previous_node = previous_node.next;
            i++;
        }

        previous_node.next = previous_node.next.next;
        
        print_linked_list();
    }
    public static void main(String[] args) {
        nth_node_last linked_list = new nth_node_last();
        linked_list.add_first("Pathak");
        linked_list.add_first("Apoorv");
        linked_list.add_first("Data Science Intern");
        linked_list.add_first("Zoplar");

        System.out.println("Initial LinkedList:");
        linked_list.print_linked_list();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the index to remove it from the LinkedList: ");
        int index_pos = input.nextInt();

        System.out.println("LinkedList after removing the element from the last " + index_pos + " position:");
        linked_list.remove_nth_node(linked_list, index_pos);
    
        input.close();
    }
}