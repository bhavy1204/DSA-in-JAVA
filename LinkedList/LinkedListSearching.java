public class LinkedListSearching {
    public class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public void iterativeSearch(int val) {
        Node temp = head;
        while (temp!=null){
            if (temp.data==val) {
                System.out.println("\nValue found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("\nvalue not there");
    }

    public int recusrsiveHelper(Node head, int val){
        if(head==null){
            return 0;
        }
        if(head.data==val){
            return 1;
        }
        return recusrsiveHelper(head.next, val);
    }

    public void recursiveSearch(int val) {
        Node temp = head;
        int found = recusrsiveHelper(temp, val);
        if(found==1){
            System.out.println("\nelement Found");
        }else{
            System.out.println("\nelement not found");
        }
    }

    public void print(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(" null ");
    }

    public static void main(String[] args) {
        LinkedListSearching l1 = new LinkedListSearching();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        l1.addLast(60);
        l1.print(head);
        // l1.iterativeSearch(200);
        l1.recursiveSearch(950);
    }
}
