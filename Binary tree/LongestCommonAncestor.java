import java.util.ArrayList;

public class LongestCommonAncestor {

    public static boolean getPath(BasicsOfTree.Node root, int n, ArrayList<BasicsOfTree.Node> al) {
        if (root == null) {
            return false;
        }

        al.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundL = getPath(root.left, n, al);
        boolean foundR = getPath(root.right, n, al);

        if (foundL || foundR) {
            return true;
        }

        al.remove(al.size() - 1);
        return false;

    }

    public static BasicsOfTree.Node lca(BasicsOfTree.Node root, int n1, int n2) {
        if (root == null) {
            return root;
        }
        ArrayList<BasicsOfTree.Node> p1 = new ArrayList<>();
        ArrayList<BasicsOfTree.Node> p2 = new ArrayList<>();

        getPath(root, n1, p1);
        getPath(root, n2, p2);

        int i = 0;
        for (; i < p1.size() && i < p2.size(); i++) {
            if (p1.get(i) != p2.get(i)) {
                break;
            }
        }

        BasicsOfTree.Node lca = p1.get(i - 1);
        return lca;

    }

    public static BasicsOfTree.Node lca2(BasicsOfTree.Node root, int n1, int n2) {
        if ( root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        BasicsOfTree.Node leftLCA = lca2(root.left, n1, n2);
        BasicsOfTree.Node rightLCA = lca2(root.right, n1, n2);

        if (rightLCA == null) {
            return leftLCA;
        }
        if (leftLCA == null) {
            return rightLCA;
        }

        return root;
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

        System.out.println(lca(root, 6, 9).data);
        System.out.println(lca2(root, 6, 9).data);
    }
}
