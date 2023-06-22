package Queue;

public class Circular_Queue_Array {
    static class Queue {
        static int array[];
        int size;
        static int rear = -1;
        static int front = -1;

        Queue(int arr_size){
            this.size = arr_size;
            array = new int[size];  
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int value) {
            if (isFull()) {
                System.out.println("The queue is full.");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            array[rear] = value;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }

            int remove_element = array[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return remove_element;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }
            
            return array[front];
        }
    }
    public static void main(String[] args) {
        Queue que_array = new Queue(5);

        que_array.add(10);
        que_array.add(104);
        que_array.add(115);
        que_array.add(150);
        que_array.add(100);

        System.out.println(que_array.remove());
        
        que_array.add(121);
        
        System.out.println(que_array.remove());

        while (!que_array.isEmpty()) {
            System.out.println(que_array.peek());
            que_array.remove();
        }
    }
}