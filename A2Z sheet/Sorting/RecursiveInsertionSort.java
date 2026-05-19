import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void recusriveInsertionSort(int arr[], int i, int n) {
        if (i==n)
            return;

        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recusriveInsertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        recusriveInsertionSort(arr, 0, arr.length);

        System.out.println("recusrive insertion SOrt : " + Arrays.toString(arr));
    }
}
