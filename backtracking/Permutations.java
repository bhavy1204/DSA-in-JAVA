public class Permutations {
    public static void findPermutations(String str, String per) {
        if (str.length() == 0) {
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, per + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
