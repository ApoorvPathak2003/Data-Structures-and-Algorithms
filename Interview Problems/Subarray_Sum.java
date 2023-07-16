import java.util.HashMap;

public class Subarray_Sum {
    public static void main(String[] args) {
        int array[] = {2, 8, -2, 4, 2, 1, 3, 1, 5, 6, 3};
        int k = 8;
        int answer = 0;
        int sum = 0;

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        hashmap.put(0, 1);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (hashmap.containsKey(sum - k)) {
                answer += hashmap.get(sum - k);
            }

            if (hashmap.containsKey(sum)) {
                hashmap.put(sum, hashmap.get(sum - k) + 1);
            } else {
                hashmap.put(sum, 1);
            }
        }

        System.out.print("Total subarray count with sum = " + k + " => " + answer);
    }
}