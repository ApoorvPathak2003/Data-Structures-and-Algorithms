package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> hash_map = new HashMap<>();
        String key = "Apoorv";

        hash_map.put("Apoorv", "Data Science Intern");
        hash_map.put("Akash", "Web Development Intern");
        hash_map.put("Ashtja", "SDE Intern");

        System.out.println("Initial HashMap: " + hash_map);

        hash_map.put("Akash", "Web Dev Intern");

        System.out.println("Updated HashMap: " + hash_map);

        if (hash_map.containsKey(key)) {
            System.out.println("The key " + key + " exists in the hashset.");
        } else {
            System.out.println("The key " + key + " does NOT exists in the hashset.");
        }

        System.out.println("The value of the '" + key + "' in the hashset: " + hash_map.get(key));
        System.out.println("The value of the 'Arshil' in the hashset: " + hash_map.get("Arshil"));

        System.out.println("Key-Value Pair:");
        for (Map.Entry<String, String> hashmap_value : hash_map.entrySet()) {
            System.out.println(hashmap_value.getKey() + " -> " +  hashmap_value.getValue());
        }

        hash_map.remove("Akash");
        System.out.println("HashMap after removing the key-value pair: " + hash_map);
    }
}