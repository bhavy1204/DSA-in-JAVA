
public class Compare {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "Hello world";

        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2));

        // for (int i = 0; i < str1.length(); i++) {
        // if (str1.charAt(i) != str2.charAt(i)) {
        // System.out.println("Kuch nhi ho sakta ab to");
        // return;
        // }
        // }

        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {

            while (i < str1.length() && !Character.isLetterOrDigit(str1.charAt(i))) {
                i++;
            }

            while (j < str2.length() && !Character.isLetterOrDigit(str2.charAt(i))) {
                j++;
            }

            if (i < str1.length() && j < str2.length()) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    System.out.println("Not equal");
                    return;
                }
                i++;
                j++;

            }

        }

        while (i < str1.length() && !Character.isLetterOrDigit(str1.charAt(i))) {
            i++;
        }

        while (j < str2.length() && !Character.isLetterOrDigit(str2.charAt(i))) {
            j++;
        }

        System.out.println(i==str1.length() && j == str2.length());

    }
}
