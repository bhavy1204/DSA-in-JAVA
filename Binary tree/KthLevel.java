public class KthLevel {
    public static void kthLevel(BasicsOfTree.Node root, int k, int level){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        kthLevel(root.left, k, level+1);
        kthLevel(root.right, k, level+1);
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
        kthLevel(root, 2, 0);
    }    
}
