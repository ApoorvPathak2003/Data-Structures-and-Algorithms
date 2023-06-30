package BinarySearchTree;

public class search_Node_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }
    // Time Complexity to search a Node in a tree -> O(h)
    // h -> height of the tree
    public static boolean search(Node root, int search_key) {
        if (root == null) {
            return false;
        }

        if (root.data > search_key) {
            return search(root.left, search_key);
        }else if (root.data == search_key) {
            return true;
        }else {
            return search(root.right, search_key);
        }
    }
    public static void main(String[] args) {
        int[] node_values = {6, 3, 1, 4, 5, 12, 9};
        int key = 3;
        Node root = null;

        for (int i = 0; i < node_values.length; i++) {
            root = insert(root, node_values[i]);
        }

        if (search(root, key)) {
            System.out.print("The key "+ key + " is found in the tree.");
        } else {
            System.out.print("The key "+ key + " is NOT found in the tree.");
        }
    }
}