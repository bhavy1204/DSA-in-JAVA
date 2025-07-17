public class OnArray {
    public static void backtrackOnArr(int arr[], int i, int val) {
        if (i == arr.length) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[j]);
            System.out.println("");
            return;
        }
        arr[i] = val;
        backtrackOnArr(arr, i + 1, val + 1);
        arr[i] -= 2; //backtracking
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println("");
        backtrackOnArr(arr, 0, 1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
}