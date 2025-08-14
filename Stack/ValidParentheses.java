import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParenthesis(String s) {
        Stack<Character> stak = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stak.push(s.charAt(i));
            } else {
                if (stak.isEmpty())
                    return false;
                if ((stak.peek() == '{' && c == '}') || (stak.peek() == '(' && c == ')') || (stak.peek() == '[' && c == ']'))
                    stak.pop();
                else
                    return false;
            }
        }
        if (stak.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValidParenthesis(s));
    }
}