public class Diameter_BinaryTree {
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
        static int sum = 0;
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
    public static int diameter_tree_approach_1(Node root) {
        if (root == null) {
            return 0;
        }

        int left_diameter = diameter_tree_approach_1(root.left);
        int right_diameter = diameter_tree_approach_1(root.right);
        int net_diameter = left_diameter + right_diameter + 1;

        return Math.max(net_diameter, Math.max(left_diameter, right_diameter));
    }
    static class TreeInfo{
        int diameter;
        int height;

        TreeInfo(int diam,int height){
            this.diameter = diam;
            this.height = height;
        }
    }
    public static TreeInfo diameter_tree_approach_2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left_diameter = diameter_tree_approach_2(root.left);
        TreeInfo right_diameter = diameter_tree_approach_2(root.right);

        int treeinfo_height = Math.max(left_diameter.height, right_diameter.height) + 1;

        int diameter1 = left_diameter.diameter;
        int diameter2 = right_diameter.diameter;
        int diameter3 = left_diameter.diameter + right_diameter.diameter + 1;

        int treeinfo_diameter = Math.max(diameter1, Math.max(diameter2, diameter3));

        return new TreeInfo(treeinfo_diameter, treeinfo_height);
    }
    public static void main(String[] args) {
        int nodes[] = {2, 5, -1, 0, -1, -1, 9, 6, -1, -1, 5, -1, -1};
        binary_tree tree = new binary_tree();
        Node root = tree.create_binary_tree(nodes);

        System.out.println("Diameter of a tree (Approach 1 -> Time Complexity:- O(n^2)): " + diameter_tree_approach_1(root));
        System.out.println("Diameter of a tree (Approach 2 -> Time Complexity:-  O(n)): " + diameter_tree_approach_2(root).diameter);
    }
}