
import java.util.ArrayDeque;
import java.util.Deque;


public class OutermostParanthesis {

    public static void removeOutermostParanthesis(String str){
        Deque<Character> st = new ArrayDeque<>();
        String ans="";
        for (char ch : str.toCharArray()) {
            if (ch==')') {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans+=ch;
            }
            if (ch=='(') {
                st.push(ch);
            }
        }

        System.out.println(ans);


    }
    
    public static void main(String[] args) {
        String str ="(()())(())";
        removeOutermostParanthesis(str);
    }
}
