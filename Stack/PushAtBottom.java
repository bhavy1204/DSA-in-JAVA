import java.util.*;

public class PushAtBottom {

    public static void PushAtBottomm(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        PushAtBottomm(s, data);
        s.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);

        PushAtBottomm(s,50);

        System.out.println(s);
    }
}
