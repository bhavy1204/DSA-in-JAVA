import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = i;
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        insertionSort(arr);

        System.out.println("Insertion sort : " + Arrays.toString(arr));
    }
}

// Insertion sort is a comparison-based sorting algorithm in which we build the sorted portion of the array one element at a time.

// The algorithm divides the array into:

// a sorted part
// an unsorted part

// In each iteration, one element is picked from the unsorted part and inserted into its correct position in the sorted part by shifting larger elements to the right.

// The time complexity is:

// Best case: O(n) when the array is already sorted
// Average case: O(n
// 2
// )
// Worst case: O(n
// 2
// ) when the array is reverse sorted

// Insertion sort is:

// Stable → maintains the relative order of equal elements
// Adaptive → performs efficiently on nearly sorted arrays
// In-place → requires only constant extra memory
// Online → can sort elements as they arrive without needing the complete dataset initially
