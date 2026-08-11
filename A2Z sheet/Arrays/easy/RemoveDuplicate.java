import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

    public static int removeDuplicate(int arr[]) {
        HashSet<Integer> ans = new HashSet<>();

        int k = 0;

        for (int el : arr) {
            if (!ans.contains(el)) {
                ans.add(el);

                arr[k] = el;
                k++;

            }
        }

        return k;
    }

    public static int removeDuplicateOptimal(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }

        Arrays.sort(arr);

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 9, 2, 1, 3, 6, 8, 4, 3, 2, 1, };

        int x = removeDuplicateOptimal(arr);

        System.out.println("Unique elements : " + x);

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
