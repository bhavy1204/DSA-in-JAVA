import java.util.HashSet;

public class DistinctElements {
    public static void checkRepeat(int arr[]) {
        boolean isDistinct = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
        }
        System.out.println("Array " + (isDistinct ? " does not contain" : " contains") + " duplicate values ");
    }

    public static void checkRepeatOptimized(int arr[]) {
        boolean isDistinct = true;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                isDistinct = false;
                break;
            }
        }

        System.out.println("Array " + (isDistinct ? " does not contain" : " contains") + " duplicate values ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 1, 4 };
        // checkRepeat(arr);
        checkRepeatOptimized(arr);
    }
}
