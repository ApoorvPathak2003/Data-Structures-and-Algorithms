package Stack;
import java.util.Stack;

public class Basic_Stack {
    public static void main(String[] args) {
        Stack<Integer> basic_stack = new Stack<>();

        basic_stack.push(1);
        basic_stack.push(10);
        basic_stack.push(100);
        basic_stack.push(1000);

        while (!basic_stack.empty()) {
            System.out.println("The Peeked Element: " + basic_stack.peek());
            basic_stack.pop();
        }
    }
}