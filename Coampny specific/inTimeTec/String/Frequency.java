import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        String str = "Hello world";

        // If all chars, we will use ASCII freq array.
        // int freq[] = new int[256];
        // for(char ch : str.toCharArray()){
        // if (ch !=' ') {
        // freq[ch]++;
        // }
        // }
        // for (int i = 0; i < freq.length; i++) {
        // if(freq[i]>0){
        // System.out.println((char)i + " : " + freq[i]);
        // }
        // }

        // for only lowercase
        // int freq[] = new int[26];
        // for (char ch : str.toCharArray()) {
        // if (ch != ' ') {
        // freq[ch - 'a']++;
        // }
        // }
        // for (int i = 0; i < freq.length; i++) {
        // if (freq[i] > 0) {
        // System.out.println((char) (i + 'a') + " : " + freq[i]);
        // }
        // }

        // without hashmaps and extra array.
        // boolean visited[] = new boolean[str.length()];
        // for (int i = 0; i < str.length(); i++) {
        // if (visited[i] || str.charAt(i) == ' ') {
        // continue;
        // }

        // int cnt = 1;

        // for (int j = i + 1; j < str.length(); j++) {
        // if (str.charAt(j) == str.charAt(i)) {
        // cnt++;
        // visited[j] = true;
        // }
        // }

        // System.out.println(str.charAt(i) + " : " + cnt);
        // }

        // with hashmaps.
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch!=' ') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        freq.forEach((key, val) -> System.out.println(key + " : " + val));

    }

}

// “If the character is already present, I get its current count. Otherwise, I start from zero and increment it.”
// if they want case-insensitive counting, you could do:
// for (char ch : str.toLowerCase().toCharArray()) {
//     if (ch != ' ') {
//         freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//     }
// }