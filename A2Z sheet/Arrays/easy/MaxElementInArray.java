public class MaxElementInArray {

    public static int largest(int arr[]) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 9, 36, 82, 5, 0, 2, 1, 4, 5, 83 };
        System.out.println(largest(arr));
    }

}
