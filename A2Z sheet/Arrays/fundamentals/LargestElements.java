/**
 * LargestElements
 */
public class LargestElements {
    public static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, -9, -2 };
        System.out.println(largest(arr));
    }

}