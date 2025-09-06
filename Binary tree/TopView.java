import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

    static class Info {
        BasicsOfTree.Node node;
        int hd;

        public Info(BasicsOfTree.Node n, int h) {
            this.node = n;
            this.hd = h;
        }

    }

    public static void topView(BasicsOfTree.Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, BasicsOfTree.Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println("");

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

        topView(root);

    }
}
