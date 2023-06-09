package Queue;

public class Queue_Array {
    static class Queue {
        static int array[];
        static int size;
        static int rear;

        Queue(int arr_size){
            Queue.size = arr_size;
            array = new int[size];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int value) {
            if (isFull()) {
                System.out.println("The queue is full.");
                return;
            }

            array[++rear] = value;
        }

        // Time Complexity = O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }

            int front = array[0];

            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }

            rear--;

            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }
            
            return array[0];
        }

        public void print_queue() {
            for (int i = 0; i < rear + 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue que_array = new Queue(4);

        que_array.add(0);
        que_array.add(10);
        que_array.add(1125);
        que_array.add(100);

        System.out.print("Initial Queue: ");
        que_array.print_queue();

        System.out.println("The Peeked Element: " + que_array.peek());
        System.err.println("The Removed Element: " + que_array.remove());
        System.out.println("The Peeked Element: " + que_array.peek());
    
        System.out.print("Final Queue: ");
        que_array.print_queue();
    }
}