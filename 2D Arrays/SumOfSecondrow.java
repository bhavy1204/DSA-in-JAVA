public class SumOfSecondrow {
    public static void sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++)
            sum += arr[1][i];
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 7, 3, 4 },
                { 5, 5, 5, 5 },
                { 9, 7, 11, 12 },
                { 13, 14, 15, 7 } };
        sum(matrix);
    }
}
