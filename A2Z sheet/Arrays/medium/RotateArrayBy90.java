public class RotateArrayBy90 {

    public static void rotateArrayBruteForce(int arr[][]) {
        int n = arr.length;

        int roateted[][] = new int[n][n];

        for (int i = 0; i < roateted.length; i++) {
            for (int j = 0; j < roateted.length; j++) {
                roateted[j][n - i - 1] = arr[i][j];
            }
        }

        for (int i = 0; i < roateted.length; i++) {
            for (int j = 0; j < roateted.length; j++) {
                System.out.print(roateted[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void rotateArrayOptimal(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // rotateArrayBruteForce(arr);
        rotateArrayOptimal(arr);

    }
}
