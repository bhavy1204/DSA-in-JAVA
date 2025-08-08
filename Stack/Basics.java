import java.util.ArrayList;

public class Basics {
    static class stack {
        ArrayList<Integer> stack = new ArrayList<>();
        int top = -1;

        public boolean isEmpty() {
            if (top == -1) {
                return true;
            }
            return false;
        }

        public void push(int data) {
            stack.add(++top, data);
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack empty");
                return;
            }
            System.out.println(stack.get(top));
            stack.remove(top);
            top--;
        }

        public void peek() {
            if (stack.isEmpty()) {
                System.out.println("Stack empty");
                return;
            }
            System.out.println(stack.get(top));
        }

        public void traverse(){
            int i = top;
            while (i !=-1) {
                System.out.print(stack.get(i--)+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.traverse();
        s.pop();
        s.traverse();
    }
}
