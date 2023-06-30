package BinarySearchTree;

// Left Subtree Node < Root
// Right Subtree Node > Root
// Left & Right Subtree are also BST with NO duplicates (may vary as per the condition)

public class BST {
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
    public static void main(String[] args) {
        int[] node_values = {6, 3, 1, 4, 5, 12, 9};
        Node root = null;

        for (int i = 0; i < node_values.length; i++) {
            root = insert(root, node_values[i]);
        }

        System.out.println("In-Order Traversal: ");
        in_order(root);
    }
}