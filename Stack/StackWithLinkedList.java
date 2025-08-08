public class StackWithLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("stack empty");
            return;
        }
        head = head.next;
    }

    public void peek() {
        if (head == null) {
            System.out.println("stack empty");
            return;
        }
        System.out.println(head.data);
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // stack.peek();
        stack.pop();
        // stack.peek();

        stack.traverse();
    }
}
