public class ReverseArray {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // brute force: create new array and start inserting in it from reverse of
        // original array.
        // better swap the first and last and similary repeat this.
        reverse(num);

    }
}
