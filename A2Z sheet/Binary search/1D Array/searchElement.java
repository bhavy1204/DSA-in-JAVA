public class searchElement {

    public static void iterative(int arr[], int k) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                System.out.println(arr[mid]);
                break;
            } else if (k >= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    }

    public static int recursive(int arr[], int k, int high, int low) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low) / 2;

        if (arr[mid] == k) {
            return mid;
        } else if (k > arr[mid]) {
            return recursive(arr, k, high, mid + 1);
        }

        return recursive(arr, k, mid - 1, low);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // iterative(arr, 7);
        System.out.println(recursive(arr, 7, arr.length, 0));

    }
}
