import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                int cnt = 0;
                while (stk.pop() != '(')
                    cnt++;
                if (cnt < 1)
                    return true;
            } else {
                stk.push(c);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "(((a)+b))";
        System.out.println(isDuplicate(s));
    }
}
