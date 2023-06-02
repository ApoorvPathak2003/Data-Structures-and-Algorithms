public class Quick_Sort {
    public static void quick_sort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivot_index = partition(numbers, low, high);
            
            quick_sort(numbers, low, pivot_index - 1);
            quick_sort(numbers, pivot_index + 1, high);
        }
    }
    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int flag = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = flag;
            }
        }
        i++;

        int temp = numbers[i];
        numbers[i] = pivot;
        numbers[high] = temp;

        return i;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 8, 6, 2, 1};

        // Average Time Complexity = O(n * logn)
        // Worst Time Complexity = O(n^2); pivot = smallest/largest element
        quick_sort(numbers, 0, numbers.length - 1);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}