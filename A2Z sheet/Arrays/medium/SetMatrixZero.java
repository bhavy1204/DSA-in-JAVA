public class SetMatrixZero {

    public static void setMatrixZeroBruteForce(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int col = 0; col < n; col++) {
                        if (arr[i][col] != 0) {
                            arr[i][col] = -1;
                        }
                    }

                    for (int row = 0; row < m; row++) {
                        if (arr[row][j] != 0) {
                            arr[row][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void setMatrixZeroBetter(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void setMatrixZeroOptimal(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < n; i++) {
            if (arr[0][i] == 0) {
                firstRowZero = true;
            }
        }

        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 2; j <n; j++) {
                if (arr[i][0]==0 || arr[0][j]==0) {
                    arr[i][j]=0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                arr[i][0]=0;
            }
        }

        if (firstRowZero) {
            for (int i = 0; i < n; i++) {
                arr[0][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // Input:matrix=[[1,1,1],[1,0,1],[1,1,1]]Output:[[1,0,1],[0,0,0],[1,0,1]]Explanation:Since
        // matrix[2][2]=0.
        // Therfore the 2nd column and 2nd row wil be set to 0.

        int[][] matrix = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        // setMatrixZeroBruteForce(matrix);
        // setMatrixZeroBetter(matrix);
        setMatrixZeroOptimal(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
