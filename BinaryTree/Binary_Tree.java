package BinaryTree;

public class Binary_Tree {
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
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, 5, -1, -1, 5, 5, -1, -1, -1};
        binary_tree tree = new binary_tree();
        Node root = tree.create_binary_tree(nodes);

        System.out.println(root.data);
    }
}