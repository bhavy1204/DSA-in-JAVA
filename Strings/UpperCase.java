public class UpperCase {
    public static String toUppercase(String s) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String toUppercase2(String s){
        StringBuilder sb = new StringBuilder("");
        boolean capitalizeNext = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isWhitespace(c)) {
                sb.append(c);
                capitalizeNext= true;
            } else if(capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext= false;
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Convert each first letter to upper case
        String str = "hello, i am under           the water  uuuu";
        // System.out.println(toUppercase(str));
        System.out.println(toUppercase2(str));
    }
}

