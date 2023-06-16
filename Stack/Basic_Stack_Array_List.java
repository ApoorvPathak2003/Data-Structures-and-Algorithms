package Stack;
import java.util.ArrayList;

public class Basic_Stack_Array_List {
    static class Stack{
        ArrayList<String> generation = new ArrayList<>();

        public boolean isEmpty(){
            return generation.size() == 0;
        }

        public void push(String value) {
            generation.add(value);
        }

        public String pop() {
            if (isEmpty()) {
                System.out.println("Linked List is empty.");
                return "";
            }

            String last_element = generation.get(generation.size() - 1);
            generation.remove(generation.size() - 1);
            return last_element;
        }

        public String peek() {
            if (isEmpty()) {
                System.out.println("Linked List is empty.");
                return "";
            }

            String last_element = generation.get(generation.size() - 1);
            return last_element;
        }
    }
    public static void main(String[] args) {
        Stack stack_array_list = new Stack();

        stack_array_list.push("Anil & Usha");
        stack_array_list.push("Neeraj & Gunjan");
        stack_array_list.push("Apoorv");

        while (!stack_array_list.isEmpty()) {
            System.out.println("The Peeked Element: " + stack_array_list.peek());
            stack_array_list.pop();
        }
    }
}