
public class Duplicate {
    public static void main(String[] args) {
        String str = "programming is fun";

        // ====================================================================================
        // boolean visited[] = new boolean[str.length()];
        // for (int i = 0; i < str.length(); i++) {
        // if (visited[i] || str.charAt(i) == ' ') {
        // continue;
        // }
        // int cnt = 1;
        // for (int j = i + 1; j < str.length(); j++) {
        // if (str.charAt(i) == str.charAt(j)) {
        // cnt++;
        // visited[j] = true;
        // }
        // }
        // if (cnt>=2) {
        // System.out.println(str.charAt(i) + " : " + cnt);
        // }
        // }

        // ==================================================================================
        // HashMaps

        // Map<Character, Integer> freq = new HashMap<>();
        // for (char ch : str.toCharArray()) {
        // if (ch != ' ') {
        // freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        // }
        // }
        // freq.forEach((key, val) -> {
        // if (val > 1) {
        // System.out.println(key + " : " + val);
        // }
        // });

        // ====================================================================================
        // int[] freq = new int[256];
        // for (char ch : str.toCharArray()) {
        // if (ch != ' ') {
        // freq[ch]++;
        // }
        // }
        // for (int i = 0; i < 256; i++) {
        // if (freq[i] > 1) {
        // System.out.println((char) i + " : " + freq[i]);
        // }
        // }

        // ====================================================================================
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }
}
