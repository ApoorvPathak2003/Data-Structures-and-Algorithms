package LinkedList;


public class Floyd_Algorithm_Delete_Cycle_Linked_List {
    class Node{
        String data;
        Node next;
    
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public void add_first(String data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        
        new_node.next = head;
        head = new_node;
    }

    public void has_cycle() {
        if (head == null) {
            System.out.println("LinkedList is empty. Hence, no cycle exists.");
            return;
        }

        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (turtle == hare) {
                System.out.println("Yes, the cycle exists in this linkedlist.");
                return;
            }
        }

        System.out.println("No cycle exists in this linkedlist.");
        return;
    }

    public static void main(String[] args) {
        Floyd_Algorithm_Delete_Cycle_Linked_List linked_list_cycle_check = new Floyd_Algorithm_Delete_Cycle_Linked_List();
        linked_list_cycle_check.add_first("Pathak");
        linked_list_cycle_check.add_first("Apoorv");
        linked_list_cycle_check.add_first("Data Science Intern");
        linked_list_cycle_check.add_first("Apoorv");

        System.out.println("Initial LinkedList(NOT a representation of linkage):");

        Node flag = head;
        while (flag.next != null) {
            System.out.print(flag.data + " -> ");
            flag = flag.next;
        }
        System.out.println("NULL");

        // Line to add cycle in the linked list
        flag.next = head;

        System.out.print("Cycle Presence Check: ");
        linked_list_cycle_check.has_cycle();
    }
}