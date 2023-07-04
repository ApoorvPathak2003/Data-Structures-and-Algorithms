package Hashing;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Implementation of HashMap -> Array of LinkedList
// Avg. Time Complexity -> O(lambda)
// Worst Time Complexity -> O(n); Hash function returns the same bucket index and all the elements are added to the same index in a single linked list OR rehashing might be time consuming.

public class HashMap_Implementation {
    static class HashMap<K, V>{
        public class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int node_count;
        private int bucket_count;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.bucket_count = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value) {
            int bucket_index = hash_function(key);
            int data_index = search_LinkedList(key, bucket_index);

            if (data_index == -1) {
                buckets[bucket_index].add(new Node(key, value));
                node_count++;
            } else {
                Node node = buckets[bucket_index].get(data_index);
                node.value = value;
            }

            double threshold_value = (double)node_count / bucket_count;

            if (threshold_value > 2.0) {
                rehash();
            }
        }

        public ArrayList<K> Keys() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> linked_list = buckets[i];
                for (int j = 0; j < linked_list.size(); j++) {
                    Node node = linked_list.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean is_empty() {
            return node_count == 0;
        }

        public V remove(K key) {
            int bucket_index = hash_function(key);
            int data_index = search_LinkedList(key, bucket_index);

            if (data_index == -1) {
                return null;
            } else {
                Node node = buckets[bucket_index].get(data_index);
                node_count--;
                return node.value;
            }
        }

        public boolean contains_key(K key) {
            int bucket_index = hash_function(key);
            int data_index = search_LinkedList(key, bucket_index);

            if (data_index == -1) {
                return false;
            } else {
                return true;
            }
        }

        public V get(K key) {
            int bucket_index = hash_function(key);
            int data_index = search_LinkedList(key, bucket_index);

            if (data_index == -1) {
                return null;
            } else {
                Node node = buckets[bucket_index].get(data_index);
                return node.value;
            }
        }

        private void rehash() {
            LinkedList<Node> old_bucket[] = buckets;
            buckets = new LinkedList[bucket_count * 2];

            for (int i = 0; i < bucket_count * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < old_bucket.length; i++) {
                LinkedList<Node> each_linked_list_bucket = old_bucket[i];
                for (int j = 0; j < each_linked_list_bucket.size(); j++) {
                    Node node = each_linked_list_bucket.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int search_LinkedList(K key, int bucket_index) {
            LinkedList<Node> bucket_linkedlist = buckets[bucket_index];

            for (int i = 0; i < bucket_linkedlist.size(); i++) {
                if (bucket_linkedlist.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        private int hash_function(K key) {
            return Math.abs(key.hashCode()) % bucket_count;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> hashmap = new HashMap<>();

        hashmap.put("Apoorv", 62);
        hashmap.put("Neeraj", 80);
        hashmap.put("Gunjan", 60);


        ArrayList<String> keys = hashmap.Keys();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -> " + hashmap.get(keys.get(i)));
        }

        System.out.println("Size of the hashmap: " + keys.size());


        System.out.println("Is the 'Apoorv' key present in the hashmap? " + hashmap.contains_key("Apoorv"));
        System.out.println("Is the 'Vinay' key present in the hashmap? " + hashmap.contains_key("Vinay"));

        input.close();
    }
}