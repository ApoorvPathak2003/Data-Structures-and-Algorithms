package Hashing;

import java.util.HashMap;

public class Element_Appearance {
    public static void main(String[] args) {
        int[] number_frequency = {1, 9, 7, 1, 5, 2, 1, 8};

        HashMap<Integer, Integer> frequency_map = new HashMap<>();

        for (int i = 0; i < number_frequency.length; i++) {
            if (frequency_map.containsKey(number_frequency[i])) {
                frequency_map.put(number_frequency[i], frequency_map.get(number_frequency[i]) + 1);
            } else {
                frequency_map.put(number_frequency[i], 1);
            }
        }

        System.out.print("Elements that has occurence greater than " + (number_frequency.length)/3 + " are: ");
        for (int frequency_map_key : frequency_map.keySet()) {
            if (frequency_map.get(frequency_map_key) > (number_frequency.length)/3) {
                System.out.print(frequency_map_key + " ");
            }
        }
    }
}