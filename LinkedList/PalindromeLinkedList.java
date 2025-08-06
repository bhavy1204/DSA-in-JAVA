public class PalindromeLinkedList {

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

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void isPalindorm() {
        if (head == null || head.next == null) {
            System.out.println("Palindrom");
            return;
        }

        Node middleNode = findMiddle(head);

        Node prev = null;
        Node curr = middleNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                System.out.println("No paliindrome");
                return;
            }
            left = left.next;
            right = right.next;
        }

        System.out.println("palindrome");
        return;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(20);
        list.addlast(10);
        list.isPalindorm();
    }
}
