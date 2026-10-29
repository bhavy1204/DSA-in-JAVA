import java.util.Stack;

public class ReverseWords {

    public static String reverseWordsStack(String s) {
        if (s == null)
            return null;

        Stack<String> stack = new Stack<>();
        StringBuilder currentWord = new StringBuilder();

        // Scan character by character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                currentWord.append(ch);
            } else if (currentWord.length() > 0) {
               
                stack.push(currentWord.toString());
                currentWord.setLength(0);
            }
        }

        
        if (currentWord.length() > 0) {
            stack.push(currentWord.toString());
        }


        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(reverseWordsStack(str));
    }
}
