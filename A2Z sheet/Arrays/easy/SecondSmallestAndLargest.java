public class SecondSmallestAndLargest {

    // public static int secondLargest(int arr[]) {
    // if (arr.length == 0)
    // return -1;

    // if (arr.length == 1) {
    // return arr[0];
    // }

    // if (arr.length == 2)
    // return Math.min(arr[0], arr[1]);

    // int largest = Integer.MIN_VALUE;
    // int secondLargest = largest;

    // for (int i = 0; i < arr.length; i++) {
    // if (largest < arr[i]) {
    // secondLargest = largest;
    // largest = arr[i];
    // }
    // if(arr[i]>secondLargest && arr[i]<largest){
    // secondLargest = arr[i];
    // }
    // }

    // return secondLargest;
    // }

    public static void secondSmallestAndLargest(int arr[]) {
        // 1. two traversal approach
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_largest = largest;
        int second_smallest = smallest;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
            smallest = Math.min(arr[i], smallest);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }

            if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }

        System.out.println("Second smallest "+ second_smallest);
        System.out.println("Second largest "+ second_largest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 9, 36, 82, 80, 84, 5, 0, 2, 1, 4, 5, 83 };
        // System.out.println("Second largest element in array :- "+secondLargest(arr));
        secondSmallestAndLargest(arr);
    }
}
