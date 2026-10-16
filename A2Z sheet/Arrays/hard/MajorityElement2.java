import java.util.*;

public class MajorityElement2 {

    public static void majorityElement2BruteForce(int arr[]) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (result.size() == 0 || result.get(0) != arr[i] || result.size() < 2 || result.get(1) != arr[i]) {
                int cnt = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        cnt++;
                }

                if (cnt > n / 3) {
                    result.add(arr[i]);
                }
            }

            if (result.size() == 2) {
                break;
            }
        }

        System.out.println(result.toString());
    }

    public static void majorityElement2Better(int arr[]) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);

            if (mpp.get(arr[i]) == mini) {
                result.add(arr[i]);
            }

            if (result.size() == 2) {
                break;
            }
        }

        System.out.println(result.toString());

    }

    public static void majorityElement2Optimal(int arr[]) {
        int n = arr.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                cnt1++;
            } else if (cnt2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                cnt2++;
            } else if (arr[i] == el1) {
                cnt1++;
            } else if (arr[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0; cnt2=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==el1) {
                cnt1++;
            }
            if (arr[j]==el2) {
                cnt2++;
            }
        }

        int mini = n/3+1;
        List<Integer> result = new ArrayList<>();
        if (cnt1>=mini) {
            result.add(el1);
        }
        if (cnt2>=mini) {
        result.add(el2);   
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        // majorityElement2BruteForce(arr);
        // majorityElement2Better(arr);
        majorityElement2Optimal(arr);
    }
}
