import java.util.Deque;
import java.util.LinkedList;

class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

    }   
}
