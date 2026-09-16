import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str = "evil";
        String str2 = "veil";

        // ====================================================================================
        // brute fiorce hashmaps
        // ====================================================================================
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : str2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }
        if (freq1.equals(freq2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagrams");
        }

        // ====================================================================================
        // better hashmaps
        // ====================================================================================
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : str2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (int cnt : map.values()) {
            if (cnt != 0) {
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");

        // ====================================================================================
        // Sorting
        // ====================================================================================
        // if (str.length() != str2.length()) {
        // System.out.println("not anagrams");
        // return;
        // }
        // char[] arr1 = str.toCharArray();
        // char[] arr2 = str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if (Arrays.equals(arr1, arr2)) {
        // System.out.println("Anagrams");
        // }else{
        // System.out.println("Not anagrams");
        // }

        // ====================================================================================
        // fixed size arrays
        // ====================================================================================

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
}

// int[] freq = new int[256];
// for (int i = 0; i < str.length(); i++) {
// freq[str.charAt(i)]++;
// freq[str2.charAt(i)]--;
// }
// for (int count : freq) {
// if (count != 0) {
// return false;
// }
// }
// return true;
