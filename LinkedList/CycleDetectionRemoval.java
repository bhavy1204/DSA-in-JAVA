public class CycleDetectionRemoval {

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

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Conataiin cycle");
                return true;
            }
        }
        System.out.println("Does not coonntain cycle");
        return false;
    }

    public void manipluate() {
        Node temp = head.next.next.next;

        tail.next = temp;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = head;
                if (slow == fast) {
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                    fast.next = null;
                    return;
                }
                Node prev = null;
                while (slow != fast) {
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                prev.next = null;
            }
        }
    }

    public static void main(String[] args) {
        CycleDetectionRemoval list = new CycleDetectionRemoval();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.isCycle();
        list.manipluate();
        list.isCycle();
        list.removeCycle();
        list.isCycle();

    }
}
