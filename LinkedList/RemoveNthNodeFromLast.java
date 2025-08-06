public class RemoveNthNodeFromLast {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void removeFromNthLast(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iFromStart = size - n;
        Node prev = head;
        while (i < iFromStart) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    public static void main(String[] args) {
        RemoveNthNodeFromLast list = new RemoveNthNodeFromLast();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.print();
        list.removeFromNthLast(3);
        list.print();
    }
}
