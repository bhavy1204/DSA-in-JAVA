public class SecondLargest {

    public static int secondLargest(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        int secondLargest = 0;
        boolean hasSecond = false;

        for (int num : arr) {
            if (num < largest) {
                if (num > secondLargest || !hasSecond) {
                    secondLargest = num;
                    hasSecond = true;
                }
            }
        }

        if (!hasSecond) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10};

        System.out.println(secondLargest(arr));


    }
}
