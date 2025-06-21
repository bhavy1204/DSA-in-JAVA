public class SearchInSortedMatrix {
    public static void search(int arr[][], int key) {
        int row = 0, col = arr[0].length-1, isFound = -1;
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
        if(isFound==-1)
            System.out.println("key is not present");
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 7, 3, 4 },
                { 5, 5, 5, 5 },
                { 9, 7, 11, 12 },
                { 13, 14, 15, 7 } };
        search(matrix, 11);
    }
}