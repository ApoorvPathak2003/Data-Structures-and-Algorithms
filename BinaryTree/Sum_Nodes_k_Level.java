package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_Nodes_k_Level {
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
    public static int sum_k_level(Node root, int k){
        if (root == null) {
            return 0;
        }

        Queue<Node> level_order_queue = new LinkedList<>();
        int sum = 0;
        int flag = 0;
        // level = 0 (top-level)
        int level = 0;
        
        level_order_queue.add(root);

        while (!level_order_queue.isEmpty()) {
            int size = level_order_queue.size();
            while(size-- > 0){
                Node level_ptr = level_order_queue.peek();
                level_order_queue.remove();

                if (level == k) {
                    flag = 1;
                    sum += level_ptr.data;
                }else{
                    if (level_ptr.left != null) {
                        level_order_queue.add(level_ptr.left);
                    }
                    if (level_ptr.right != null) {
                        level_order_queue.add(level_ptr.right);
                        
                    }
                }
            }
            level++;

            if (flag == 1) {
                break;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, 0, -1, -1, 9, 6, -1, -1, 5, -1, -1};
        int k = 1; 
        
        // k = 1 -> 2nd level from top
        // level = 0 (top-level)

        binary_tree tree = new binary_tree();
        Node root = tree.create_binary_tree(nodes);

        System.out.print("Sum of nodes at" + k +" level: " + sum_k_level(root, k));
    }
}