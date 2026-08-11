import java.util.Arrays;

public class ZerosToEnd {

    public static void moveZeros(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
    }

    public static void moveZeros2(int arr[]) {
        int n = arr.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j++] = arr[i];
                arr[i] = temp;
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveZeros2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
