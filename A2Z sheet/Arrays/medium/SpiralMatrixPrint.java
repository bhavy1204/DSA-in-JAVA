import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixPrint {

    public static void printSpiralMatrix(int arr[][]){
        List<Object> result = new ArrayList<>();

        int top  =0;
        int bottom= arr[0].length-1;
        int right = arr.length-1;
        int left =0;

        while (left<=right && top<bottom) {
            for (int i = left; i <=right; i++) {
                result.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <=bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            if (top<=bottom) {
                for (int i = right; i >=left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left<=right) {
                for (int i = bottom; i >=top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }

        }

        for (Object object : result) {
            System.out.print(object+" ,  ");
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiralMatrix(matrix);
    }
}
