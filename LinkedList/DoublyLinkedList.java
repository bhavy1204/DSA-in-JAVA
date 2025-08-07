public class DoublyLinkedList {
    class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
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

        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = null;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        return;
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;

        return;
    }

    public void removeFirst() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(10);
        dll.addLast(20);
        dll.addFirst(5);
        dll.removeFirst();
        dll.removeLast();

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
