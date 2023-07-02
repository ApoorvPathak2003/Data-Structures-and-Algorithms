package BinarySearchTree;

public class Print_in_Range {
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
    public static void print_in_range(Node root, int lower_bound, int upper_bound) {
        if (root == null) {
            return;
        }

        if (root.data >= lower_bound && root.data <= upper_bound) {
            print_in_range(root.left, lower_bound, upper_bound);
            System.out.print(root.data + ", ");
            print_in_range(root.right, lower_bound, upper_bound);
        } else if (root.data <= lower_bound) {
            print_in_range(root.right, lower_bound, upper_bound);
        } else {
            print_in_range(root.left, lower_bound, upper_bound);
        }
    }
    public static void main(String[] args) {
        int[] node_values = {6, 3, 1, 4, 5, 12, 9};
        int lower_bound = 2;
        int upper_bound = 8;
        Node root = null;

        for (int i = 0; i < node_values.length; i++) {
            root = insert(root, node_values[i]);
        }

        System.out.println("In-Order Traversal(Initial):");
        in_order(root);

        System.out.print("\nNumbers in the range of " + lower_bound + " & " + upper_bound + " are: ");
        print_in_range(root, lower_bound, upper_bound);
    }
}