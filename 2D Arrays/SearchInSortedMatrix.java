public class SearchInSortedMatrix {
    public static void search(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1, isFound = -1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Fund key at : [" + row + "," + col + "]");
                isFound = 1;
            }
            if (key < arr[row][col])
                col--;
            else
                row++;
        }
        if (isFound == -1)
            System.out.println("key is not present");
    }

    public static void search2(int arr[][], int key) {
        int row = arr.length - 1, col = 0, isFound = -1;
        while (col < arr[0].length && row >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Fund key at : [" + row + "," + col + "]");
                isFound = 1;
                return;
            }
            if (key > arr[row][col])
                col++;
            else
                row--;
        }
        if (isFound == -1)
            System.out.println("key is not present");
    }

    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 8, 10, 12, 14 },
                { 15, 17, 19, 21 },
                { 22, 24, 26, 28 }
        };
        search2(matrix, 21);
    }
}