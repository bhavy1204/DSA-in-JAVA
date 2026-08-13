import java.util.*;

public class MajorityElements {

    public static void majorityElementBruteForce(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > n / 2) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void majorityElementBetter(int arr[]) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println(-1);
    }

    public static void majorityElementOptimal(int arr[]) {
        int n = arr.length;

        int cnt = 0;
        int el = arr[0];

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > n / 2) {
            System.out.println(el);
            return;
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7, 7, 7, 7, 7, 7, 3, 1, 4, 3, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // majorityElementBruteForce(arr);
        // majorityElementBetter(arr);
        majorityElementOptimal(arr);

    }
}
