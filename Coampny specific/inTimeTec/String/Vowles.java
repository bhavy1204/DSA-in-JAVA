public class Vowles {
    public static void main(String[] args) {
        String str = "Hello WOrld";
        int vowel = 0, consonant = 0;
        // for (char ch : str.toCharArray()) {
        // if (Character.isLetter(ch)) {
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
        // 'A' || ch == 'E' || ch == 'I'
        // || ch == 'O' || ch == 'U') {
        // vowel++;
        // } else {
        // consonant++;
        // }
        // }
        // }
        // System.out.println(vowel + "\n" + consonant);

        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowel + "\n" + consonant);
    }
}
