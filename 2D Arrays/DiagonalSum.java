public class DiagonalSum {
    // Sum of primary diagonal = arr[i][j] >> i=j
    // Sum of Secondary diagonal =  arr[i][j] >> i+j = arr.length -1;
    public static void diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1)
                    sum += arr[i][j];
            }
        }
        System.out.println("Diagonal sum : " + sum);
    }

    public static void optimizedVersion(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length-1-i)
                sum += arr[i][arr.length-1-i];
        }
        System.out.println("Diagonal sum : " + sum);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // diagonalSum(matrix);
        optimizedVersion(matrix);
    }
}
