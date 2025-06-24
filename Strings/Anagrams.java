import java.util.Arrays;

public class Anagrams {
    public static void isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2)) {
                System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams");
            } else
                System.out.println("Not anagarams");

        } else {
            System.out.println("Nhi hai bhai anagram rehne de");
        }
    }

    public static void main(String[] args) {
        String s1 = "Heart", s2 = "Earth";
        isAnagram(s1, s2);

    }
}
