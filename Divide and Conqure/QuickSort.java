public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;

        // For pivot
        int pivotIdx = partition(arr, si, ei);
        // left of pivot
        quickSort(arr, si, pivotIdx - 1);
        // Right of pivot
        quickSort(arr, pivotIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 1, 7, 6, 5, 4, 3, 3, 2, 1 };
        print(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array: -");
        print(arr);
    }
}
