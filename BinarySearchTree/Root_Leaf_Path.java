package BinarySearchTree;

import java.util.ArrayList;

public class Root_Leaf_Path {
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
    public static void in_order(Node root) {
        if (root == null) {
            return;
        }
        in_order(root.left);
        System.out.print(root.data + " ");
        in_order(root.right);
    }
    public static void root_leaf_path(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size() - 1; i++) {
                System.out.print(path.get(i) + " -> ");
            }
            System.out.print(path.get(path.size() - 1));
            System.out.println();
        } else {
            root_leaf_path(root.left, path);
            root_leaf_path(root.right, path);
        }

        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int[] node_values = {6, 3, 1, 4, 5, 12, 9};
        Node root = null;

        for (int i = 0; i < node_values.length; i++) {
            root = insert(root, node_values[i]);
        }

        System.out.println("In-Order Traversal: ");
        in_order(root);
        
        System.out.println("\nRoot to Leaf Path:");
        root_leaf_path(root, new ArrayList<>());
    }
}