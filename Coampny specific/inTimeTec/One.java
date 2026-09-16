import java.util.Arrays;

public class One {

    public static void reverse() {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void transpose() {
        int arr[][] = { { 1, 2 }, { 3, 4 } };

        System.out.println("Original: " + Arrays.deepToString(arr));
        int row = arr.length;
        int col = arr[0].length;

        int trans[][] = new int[col][row];

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed: " + Arrays.deepToString(trans));
    }

    public static void minMax() {
        int arr[] = { 1, 2, 3, 4, 5 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMax = max;
        int secMin = min;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }

            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }

        }

        System.out.println(min + ", " + max);
        System.out.println(secMin + ", " + secMax);

    }

    public static void sorted() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }

    public static void firstRepeat() {
        int arr[] = { 1, 4, 2, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            
        }
    }

    public static void main(String[] args) {
        // reverse();
        // transpose();
        minMax();
    }
}