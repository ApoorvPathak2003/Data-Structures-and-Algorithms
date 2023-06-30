public class Delete_Node_BST {
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
    public static Node delete(Node root, int value) {
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if(root.data < value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node inOrder_successor = in_order_successor(root.right);
                root.data = inOrder_successor.data;
                root.right = delete(root.right, inOrder_successor.data);
            }
        }
        return root;
    }
    private static Node in_order_successor(Node root) {
        while (root.left != null) {
            root = root.left;
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
        int key = 5;
        Node root = null;

        for (int i = 0; i < node_values.length; i++) {
            root = insert(root, node_values[i]);
        }

        System.out.println("In-Order Traversal(Initial):");
        in_order(root);

        System.out.println("\nDeleted key: " + delete(root, key).data);

        System.out.println("In-Order Traversal(After deletion):");
        in_order(root);
    }
}