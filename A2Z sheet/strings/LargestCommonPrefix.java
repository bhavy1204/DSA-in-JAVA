
import java.util.Arrays;

public class LargestCommonPrefix {
    public static void largestCommonPrefix(String str[]) {
        Arrays.sort(str);
        String ans = "";
        String first = str[0];
        String last = str[str.length - 1];
        int len = first.length() > last.length() ? first.length() : last.length();

        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                ans += first.charAt(i);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str[] = { "flower", "flow", "fly" };
        largestCommonPrefix(str);
    }
}
