public class ValidAnagrams {

    public static void validAnagrams(String str, String str2) {
        if (str.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int i : freq) {
            if (i != 0) {
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }

    public static void main(String[] args) {
        validAnagrams("hello", "elhlo");
    }
}
