public class SubTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binary_tree{
        static int index = -1;
        public Node create_binary_tree(int nodes[]) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node new_node = new Node(nodes[index]);
            new_node.left = create_binary_tree(nodes);
            new_node.right = create_binary_tree(nodes);

            return new_node;
        }
    }
    public static boolean subTree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (is_Identical(root, subroot)) {
                return true;
            }
        }

        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }
    private static boolean is_Identical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }

        if (root == null || subroot == null) {
            return false;
        }

        if (root.data == subroot.data) {
            return is_Identical(root.left, subroot.left) && is_Identical(root.right, subroot.right);
        }

        return false;
    }
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, -1, 9, 6, -1, -1, -1};
        int sub_nodes[] = {9, 6, -1, -1, -1};

        binary_tree tree = new binary_tree();
        binary_tree sub_tree = new binary_tree();
        
        Node root = tree.create_binary_tree(nodes);
        binary_tree.index = -1;
        Node sub_root = sub_tree.create_binary_tree(sub_nodes);

        System.out.println("Is the subtree a part of the tree? " + subTree(root, sub_root));
    }
}