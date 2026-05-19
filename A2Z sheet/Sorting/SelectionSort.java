import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        selectionSort(arr);

        System.out.println("Seletcon sort : " + Arrays.toString(arr));
    }
}

// Selection sort is an in-place, comparison-based sorting algorithm in which we repeatedly select the smallest element from the unsorted part of the array and place it at its correct position by swapping.
// In every iteration, the array is divided into two parts:
// the sorted portion
// the unsorted (remaining) portion
// The outer loop keeps track of the boundary between sorted and unsorted parts, while the inner loop searches for the minimum element in the remaining unsorted area, typically from i + 1 to n - 1.
// After finding the minimum element, it is swapped with the current index i.
// The time complexity of selection sort is:
// Best/avg/worst case: O(n^2) 
// This is because the algorithm always performs the same number of comparisons regardless of input order.
// Selection sort is unstable by default because swapping can change the relative order of equal elements.
