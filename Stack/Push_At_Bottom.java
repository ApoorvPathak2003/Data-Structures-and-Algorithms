package Stack;

import java.util.Stack;

public class Push_At_Bottom {
    public static void main(String[] args) {
        Stack<Integer> push_bottom = new Stack<>();

        push_bottom.push(1);
        push_bottom.push(15);
        push_bottom.push(19);
        push_bottom.push(10);
        push_bottom.push(104);
        push_bottom.push(154);

        push_element_bottom(18, push_bottom);

        System.out.println("The elements of the stack are:");
        while (!push_bottom.isEmpty()) {
            System.out.println(push_bottom.peek());
            push_bottom.pop();
        }
    }

    private static void push_element_bottom(int value, Stack<Integer> push_bottom) {
        if (push_bottom.isEmpty()) {
            push_bottom.push(value);
            return;
        }

        int top_element = push_bottom.pop();
        push_element_bottom(value, push_bottom);
        push_bottom.push(top_element);
    }
}