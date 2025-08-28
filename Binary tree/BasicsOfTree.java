public class BasicsOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BuildTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int height = 0;
            int lH, rH;
            lH = height(root.left);
            rH = height(root.right);
            height = Math.max(lH, rH) + 1;
            return height;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, 4, 4, -1, 4, 4, -1, 4, 4 };

        BuildTree b = new BuildTree();
        Node root = b.buildTree(nodes);

        b.preOrder(root);
        System.out.println();
        b.postOrder(root);
        System.out.println();
        b.inOrder(root);
        System.out.println("\nHeight : " + b.height(root));
    }
}