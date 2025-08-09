import java.util.Stack;

public class usingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data){
        s1.push(data);
    }

    public void dequeue(){
        if(s2.empty()){
            if(s1.empty()){
                System.out.println("Empty");
                return;
            }
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        System.out.println("poped ele "+ s2.pop());
    }

    public void traverse(){
        for (int i = s2.size()-1; i >= 0 ; i--) {
            System.out.print(s2.get(i)+" ");
        }
        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.get(i)+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        usingStacks q = new usingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.traverse();
        q.dequeue();
        q.traverse();
    }
}
