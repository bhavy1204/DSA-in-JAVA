import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFrequency{
    public static String frequencySort(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new List[s.length() + 1];
        for (char key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        StringBuilder result = new StringBuilder();
        for (int pos = buckets.length - 1; pos >= 1; pos--) {
            if (buckets[pos] != null) {
                for (char c : buckets[pos]) {
                    // Append the character 'pos' times
                    for (int i = 0; i < pos; i++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println( frequencySort("tree"));       
    }
}
