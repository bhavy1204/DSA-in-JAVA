public class LinkedListPractice {

    public class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        Node newNode = new Node(data);
        if (head == null && idx != 0) {
            System.err.println("Linked list empty, idx not found");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("idx out of bound");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LL empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " deletd");
            head = tail = null;
            return;
        }
        System.out.println(head.data + " deleted");
        head = head.next;
        return;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("LL empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " deletd");
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void removeMiddle(int idx) {
        if (head == null) {
            System.out.println("LL empty");
            return;
        }
        if (idx == 0) {
            System.out.println(head.data + " deletd");
            head = head.next;
            if (head == null) {
                head = tail = null;
            }
            return;
        }
        int i = 0;
        Node temp = head.next;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Idx out of bound");
            return;
        }
        temp.next = temp.next.next;
        if(temp.next== null){
            tail = temp;
        }
    }

    public static void main(String[] args) {
        LinkedListPractice l1 = new LinkedListPractice();
        l1.addFirst(10);
    }
}
