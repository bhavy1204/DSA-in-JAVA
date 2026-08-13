public class NextPermutation {

    public static void nextPermutation(int arr[]) {
        int n = arr.length;
        int idx = -1;

        // first decresing element or breaking point in array
        for (int i = n-2; i >0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                swap(arr, idx, i);
                break;
            }
        }

        reverse(arr, idx + 1, n - 1);

    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };

        nextPermutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
