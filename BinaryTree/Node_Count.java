package BinaryTree;

public class Node_Count {
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
    public static int count_nodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left_node_count = count_nodes(root.left);
        int right_node_count = count_nodes(root.right);

        return left_node_count + right_node_count + 1;
    }
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, 0, -1, -1, 9, 6, -1, -1, 5, -1, -1};
        binary_tree tree = new binary_tree();
        Node root = tree.create_binary_tree(nodes);

        System.out.println("Node Count: " + count_nodes(root));
    }
}