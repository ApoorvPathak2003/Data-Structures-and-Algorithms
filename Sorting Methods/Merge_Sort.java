public class Merge_Sort {
    public static void divide(int numbers[], int start_index, int last_index) {
        if (start_index >= last_index) {
            return;
        }

        int middle_index = start_index + (last_index - start_index) / 2;

        divide(numbers, start_index, middle_index);
        divide(numbers, middle_index + 1, last_index);
        conquer(numbers, start_index, middle_index, last_index);
    }
    private static void conquer(int[] numbers, int start_index, int middle_index, int last_index) {
        int[] merged_array = new int[last_index - start_index + 1];

        int x = 0;
        int index_1 = start_index;
        int index_2 = middle_index + 1;

        while (index_1 <= middle_index && index_2 <= last_index) {
            if (numbers[index_1] <= numbers[index_2]) {
                merged_array[x++] = numbers[index_1++];
            }else{
                merged_array[x++] = numbers[index_2++];
            }
        }

        while (index_1 <= middle_index) {
            merged_array[x++] = numbers[index_1++];
        }

        while (index_2 <= last_index) {
            merged_array[x++] = numbers[index_2++];
        }

        for (int i = 0, j = start_index; i < merged_array.length; i++, j++) {
            numbers[j] = merged_array[i];
        }
    }
    public static void main(String[] args) {
        int[] numbers = {5, 4, 2, 8, 6, 7, 1};

        // Time Complexity = O(n*logn)
        divide(numbers, 0, numbers.length - 1);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}