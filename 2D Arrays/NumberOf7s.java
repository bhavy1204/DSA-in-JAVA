public class NumberOf7s {
    public static void noOfSeven(int arr[][]){
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==7)
                    cnt++;   
            }
        }
        System.out.println("No of 7 are : "+cnt);
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 7, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 7, 11, 12 },
                { 13, 14, 15, 7 } };
        noOfSeven(matrix);
    }
}
