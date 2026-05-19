import java.util.Arrays;

public class quickSort {

    public static void quickSOrt(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high);

            quickSOrt(arr, low, piv - 1);
            quickSOrt(arr, piv + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        quickSOrt(arr, 0, arr.length-1);

        System.out.println("Quick SOrt : " + Arrays.toString(arr));
    }
}

// Quick sort is a divide-and-conquer based sorting algorithm that works by selecting a pivot element and partitioning the array such that elements smaller than the pivot are placed on the left side and elements greater than the pivot are placed on the right side.

// After partitioning, the pivot reaches its correct position, and the same process is recursively applied to the left and right subarrays.

// The pivot can be selected in different ways depending on the implementation, such as:
// first element
// last element
// middle element
// random element

// Quick sort is:
// Recursive in nature
// In-place because it requires very little extra memory
// Unstable because the relative order of equal elements may change
// Generally not adaptive

// Time complexity:
// Best case: O(nlogn)
// Worst case: O(n^2)

// The worst case occurs when highly unbalanced partitions are generated repeatedly, such as when the smallest or largest element is consistently chosen as the pivot.