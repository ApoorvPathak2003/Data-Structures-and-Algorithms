public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 5, 7, 1};

        // Time Complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest_index] > arr[j]) {
                    smallest_index = j;
                }
            }
            int swap = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = swap;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}