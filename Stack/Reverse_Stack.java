package Stack;

import java.util.Stack;

public class Reverse_Stack {
    private static void push_element_bottom(int value, Stack<Integer> push_bottom) {
        if (push_bottom.isEmpty()) {
            push_bottom.push(value);
            return;
        }

        int top_element = push_bottom.pop();
        push_element_bottom(value, push_bottom);
        push_bottom.push(top_element);
    }

    public static void reverse_stack(Stack<Integer> push_bottom) {
        if (!push_bottom.isEmpty()) {
            return;
        }

        int top_element = push_bottom.pop();
        reverse_stack(push_bottom);
        push_element_bottom(top_element, push_bottom);
    }

    public static void main(String[] args) {
        Stack<Integer> push_bottom = new Stack<>();

        push_bottom.push(1);
        push_bottom.push(15);
        push_bottom.push(19);
        push_bottom.push(10);
        push_bottom.push(104);
        push_bottom.push(154);

        reverse_stack(push_bottom);

        System.out.println("The elements of the reversed stack are:");
        while (!push_bottom.isEmpty()) {
            System.out.println(push_bottom.peek());
            push_bottom.pop();
        }
    }
}