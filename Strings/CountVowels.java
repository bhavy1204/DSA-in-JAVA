public class CountVowels {
    public static void countvowels(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;
            }
        }
        System.out.println("Number of vowels : " + cnt);
    }

    public static void main(String[] args) {
        String s = "hello world";
        countvowels(s);
    }
}
