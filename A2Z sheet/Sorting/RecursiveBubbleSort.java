import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void recursiveBubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }

        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }

        if (!swapped)
            return;

        recursiveBubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        recursiveBubbleSort(arr, arr.length - 1);
        
        System.out.println("recuusrice bubble SOrt : " + Arrays.toString(arr));
    }
}