package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_Java_Framework {
    static class Queue_Framework{
        static Stack<Integer> stack_1 = new Stack<>();
        static Stack<Integer> stack_2 = new Stack<>();

        public static boolean isEmpty() {
            return stack_1.isEmpty();
        }

        public static void add(int data) {
            while (!stack_1.isEmpty()) {
                stack_2.push(stack_1.pop());
            }

            stack_1.push(data);

            while (!stack_2.isEmpty()) {
                stack_1.push(stack_2.pop());
            }
        }

        public static int remove() {
            if (stack_1.isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }

            return stack_1.pop();
        }

        public static int peek() {
            if (stack_1.isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }

            return stack_1.peek();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que_framework = new LinkedList<>();
        que_framework.add(1);
        que_framework.add(5);
        que_framework.add(6);
        que_framework.add(9);
        que_framework.add(4);

        while (!que_framework.isEmpty()) {
            System.out.print(que_framework.peek() + " ");
            que_framework.remove();
        }
    }
}