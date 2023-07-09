package Hashing;

import java.util.HashSet;

public class Union_Array {
    public static void union(int[] array_1, int[] array_2) {
        HashSet<Integer> union_hashset = new HashSet<>();

        for (int i = 0; i < array_1.length; i++) {
            union_hashset.add(array_1[i]);
        }

        for (int i = 0; i < array_2.length; i++) {
            union_hashset.add(array_2[i]);
        }

        System.out.print("HashSet: " + union_hashset);
    }
    public static void main(String[] args) {
        int array_1[] = {1, 5, 9, 6};
        int array_2[] = {2, 9, 8, 5, 1, 6, 8, 0};

        union(array_1, array_2);
    }
}