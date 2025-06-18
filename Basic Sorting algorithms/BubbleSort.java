public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        boolean swaped = false;
        for (int i = 0; i < arr.length; i++) {
            swaped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if (!swaped)
                break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 2, 9, 5, 8, 4, 7 };
        bubbleSort(arr);
    }
}