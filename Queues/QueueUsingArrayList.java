import java.util.ArrayList;

public class QueueUsingArrayList {

    static class Queue {
        ArrayList<Integer> q = new ArrayList<>();
        int rear = -1;
        int front = -1;

        public void enqueue(int data) {
            if (q.isEmpty()) {
                rear = front = 0;
                q.add(rear, data);
                return;
            }
            q.add(++rear, data);
        }

        public void dequeue() {
            if (q.isEmpty()) {
                System.out.println("Empty");
                return;
            }
            q.remove(front);
        }

        public void traverse() {
            if (q.isEmpty()) {
                System.out.println("Empty");
                return;
            }
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.traverse();
        q.dequeue();
        q.traverse();
    }
}
