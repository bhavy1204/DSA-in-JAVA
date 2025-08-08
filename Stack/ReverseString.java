import java.util.*;

class ReverseString {

    public static String reverseString(String str){

        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx++));
        }

        StringBuilder revStr = new StringBuilder("");
        while (!s.isEmpty()) {
            revStr.append(s.pop());
        }

        return revStr.toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(reverseString(str));
    }
}