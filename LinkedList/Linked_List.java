package LinkedList;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<String>();
        linked_list.addFirst("Apoorv");
        linked_list.addFirst("Pathak");
        System.out.println(linked_list);
        
        System.out.println("Size of the Linked List: " + linked_list.size());
        
        linked_list.addLast("Data Science Intern");
        linked_list.addLast("Zoplar");
        System.out.println(linked_list);

        linked_list.removeFirst();
        System.out.println(linked_list);

        System.out.println("Size of the Linked List: " + linked_list.size());
        
        linked_list.removeLast();
        System.out.println(linked_list);

        System.out.println("Size of the Linked List: " + linked_list.size());

        for (int i = 0; i < linked_list.size(); i++) {
            System.out.print(linked_list.get(i) + " -> ");
        }

        System.out.println("NULL");

        linked_list.remove(1);
        System.out.println(linked_list);
    }
}