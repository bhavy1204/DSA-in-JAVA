import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    static class MyQueue{
        Deque<Integer> dq = new LinkedList<>();

        public void enqueue(int data){
            dq.addLast(data);
        }

        public void dequeue(){
            dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }

        public void traverse(){
            System.out.println(dq);
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.traverse();
    } 
}
