import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal {
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
    public static void level_order_traversal(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> level_order_queue = new LinkedList<>();
        
        level_order_queue.add(root);
        level_order_queue.add(null);

        while (!level_order_queue.isEmpty()) {
            Node current_node = level_order_queue.remove();
            if (current_node == null) {
                System.out.println();
                if (level_order_queue.isEmpty()) {
                    break;
                }else{
                    level_order_queue.add(null);
                }
            } else {
                System.out.print(current_node.data + " ");
                if (current_node.left != null) {
                    level_order_queue.add(current_node.left);
                }
                if (current_node.right != null) {
                    level_order_queue.add(current_node.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, 0, -1, -1, 9, 6, -1, -1, 5, -1, -1};
        binary_tree tree = new binary_tree();
        Node root = tree.create_binary_tree(nodes);

        System.out.println("Level-Order Traversal: ");
        level_order_traversal(root);
    }
}