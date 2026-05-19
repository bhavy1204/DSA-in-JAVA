import java.util.Arrays;

class BubbleSort {

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 4, 2, 0, 3, 21, 3 };

        bubbleSort(arr);

        System.out.println("bubble sort : " + Arrays.toString(arr));

    }
}

// Bubble sort is a comparison-based sorting algorithm where adjacent elements are repeatedly compared and swapped if they are in the wrong order.
// The algorithm works in multiple passes. After each pass, the largest unsorted element moves to its correct position at the end of the array, which is why it is called “bubble” sort.
// The outer loop keeps track of the number of passes, while the inner loop performs the actual comparisons and swaps between adjacent elements.
// After every pass, one element gets fixed at its correct position, so the range of the inner loop decreases from n - 1 to n - i - 1.
// The time complexity is:
// Worst case: O(n^2)
// Best case: O(n) when the array is already sorted and we use an optimization flag.
// The optimization works by checking whether any swap occurred during a pass. If no swap happens, the algorithm terminates early because the array is already sorted.
