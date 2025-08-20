import java.util.LinkedList;
import java.util.Deque;

public class StackUsingDeque {

    static class MyStack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public void pop() {
            if (dq.size() == 0)
                System.out.println("Empty stack");
            dq.removeLast();
        }

        public int peek() {
            if (dq.size() == 0)
                return -1;
            return dq.getLast();
        }

    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
