import java.util.Arrays;

public class RotateByKPlace {

    // right
    public static void rotateByKPlaceRight(int arr[], int k) {
        int n = arr.length;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    // left

    public static void rotateByKPlaceLeft(int arr[], int k) {
        int n = arr.length;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, 0, k);

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    // optimal approach

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void rightKRotation(int arr[], int k) {
        int n = arr.length;

        k=k%n;

        if (n == 0) {
            return;
        }

        reverseArray(arr, 0, n-1);

        reverseArray(arr, 0, k-1);

        reverseArray(arr, k, n-1);
    }

    public static void leftKRotation(int arr[], int k) {
        int n = arr.length;
        k=k%n;

        if (n == 0) {
            return;
        }

        reverseArray(arr, 0, k-1);

        reverseArray(arr, k, n - 1);

        reverseArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // rotateByKPlaceRight(arr, 2);
        // rotateByKPlaceLeft(arr, 2);
        leftKRotation(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
