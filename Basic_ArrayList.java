import java.util.ArrayList;
import java.util.Collections;

public class Basic_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<Integer>();

        // add element
        num_list.add(79);
        num_list.add(50);
        num_list.add(14);
        num_list.add(18);
        num_list.add(12);

        System.out.println("ArrayList: " + num_list);

        // get element
        int first_element = num_list.get(0);
        System.out.println("First Element: " + first_element);
        
        // add element at specific index
        num_list.add(1, 89);
        System.out.println("After adding the element to the arraylist: " + num_list);
        
        // set element at a secific index
        num_list.set(3, 65);
        System.out.println("After editing an element to the arraylist: " + num_list);
        
        // remove the element
        num_list.remove(2);
        System.out.println("After removing an element from the arraylist: " + num_list);

        // size of the arraylist
        int size = num_list.size();
        System.out.println("Size of the arraylist: " + size);

        System.out.print("Arraylist elements using loops: ");
        for (int i = 0; i < num_list.size(); i++) {
            System.out.print(num_list.get(i) + " ");
        }
        System.out.println();

        // sorting the arraylist
        Collections.sort(num_list);
        System.out.print("Arraylist after sorting: ");
        System.out.println(num_list);
    }
}