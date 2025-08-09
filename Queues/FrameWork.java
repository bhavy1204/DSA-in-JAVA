import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class FrameWork {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());

        System.out.println("--------------------------------------------------");

         Queue<Integer> q2 = new ArrayDeque<>();
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(40);
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);
        System.out.println(q2.peek());
    }
}
