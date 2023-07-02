package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(3);
        hash_set.add(9);
        hash_set.add(8);

        System.out.println("Hashset: " + hash_set);
        
        System.out.println("Size of the HashSet: " + hash_set.size());
        
        if (hash_set.contains(2)) {
            System.out.println("The hashset contains 2.");
        } else {
            System.out.println("The hashset does not contains 2.");
        }
        
        Iterator<Integer> itr = hash_set.iterator();
        
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        
        // On passing a number(element) NOT present in the HashSet
        hash_set.remove(9);

        System.out.println("\nHashset: " + hash_set);

        System.out.println("Size of the HashSet: " + hash_set.size());

        if (!hash_set.isEmpty()) {
            System.out.println("The HashSet is NOT empty.");
        }
    }
}