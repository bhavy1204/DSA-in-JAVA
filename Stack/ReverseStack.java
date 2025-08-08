import java.util.*;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        pushAtBottom(s,data);
        s.push(val);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int val = s.pop();
        reverseStack(s);
        pushAtBottom(s,val);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s);
        reverseStack(s);
        // Collections.reverse(s);
        System.out.println(s);
    }   
}
