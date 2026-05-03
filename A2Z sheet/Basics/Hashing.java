import java.util.*;

public class Hashing {
    static void basicNumberHashing() {
        int arr[] = { 1, 2, 1, 2, 3, 4, 1 };
        int hash[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        for (int i = 0; i < hash.length; i++) {
            System.out.println(i + " -> " + hash[i]);
        }

    }

    static void basicCharHashing() {
        char arr[] = { 'a', 'b', 'b', 'c', 'a', 'e' };
        int hash[] = new int[25];

        for (char c : arr) {
            hash[c - 'a'] += 1;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
            } else {

                System.out.println((char) (i + 97) + " -> " + hash[i]);
            }
        }
    }

    static void hashingUsingMap() {
        int arr[] = { 1, 2, 1, 2, 3, 4, 1 };
        HashMap<Integer, Integer> freqCount = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (freqCount.containsKey(arr[i])) {
                freqCount.put(arr[i], freqCount.get(arr[i]) + 1);
            } else {
                freqCount.put(arr[i], 1);
            }
        }

        freqCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    static void minAndMaxFreqElements() {
        int arr[] = { 1, 2, 1, 2, 3, 4, 1 };
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;

        // Traverse map to find min and max frequency elements
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String[] args) {
        // basicNumberHashing();
        // basicCharHashing();
        // hashingUsingMap();
        minAndMaxFreqElements();
    }
}