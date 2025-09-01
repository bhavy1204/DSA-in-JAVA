public class DiameterOfTree {

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

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftD = diameter(root.left);
        int leftH = height(root.left);
        int rightD = diameter(root.right);
        int rightH = height(root.right);

        int diameter = leftH + rightH + 1;

        return Math.max(Math.max(leftD, rightD), diameter);
    }

    static class Info {
        int diam;
        int height;

        public Info(int d, int h) {
            this.diam = d;
            this.height = h;
        }
    }

    public static Info diameter2(Node root) {
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int d = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height + rightInfo.height + 1);
        int h = Math.max(leftInfo.height, rightInfo.height + 1);

        return new Info(d, h);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.left = new Node(8);
        // root.right.right.right = new Node(9);
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
