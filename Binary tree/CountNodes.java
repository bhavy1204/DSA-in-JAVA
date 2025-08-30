public class CountNodes {

    public static int countNodes(BasicsOfTree.Node root) {
        if (root == null) {
            return 0;
        }

        int lC = countNodes(root.left);
        int rC = countNodes(root.right);

        return lC + rC + 1;

    }

    public static void main(String[] args) {
        BasicsOfTree.Node root = new BasicsOfTree.Node(1);
        root.left = new BasicsOfTree.Node(2);
        root.right = new BasicsOfTree.Node(3);
        root.left.left = new BasicsOfTree.Node(4);
        root.left.right = new BasicsOfTree.Node(5);
        root.right.left = new BasicsOfTree.Node(6);
        root.right.right = new BasicsOfTree.Node(7);
        root.right.right.left = new BasicsOfTree.Node(8);
        root.right.right.right = new BasicsOfTree.Node(9);
        System.out.println(countNodes(root));
    }
}
