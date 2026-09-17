import java.util.Arrays;

public class Misc {

    public static void fib() {
        int n = 10;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void prime() {
        int n = 5;

        if (n <= 1) {
            System.out.println("false");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }

    public static void gcd() {
        int a = 10, b = 20;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
        // This code finds the GCD (Greatest Common Divisor) of two numbers, 10 and 20,
        // using Euclid’s algorithm. We repeatedly divide a by b and store the remainder
        // in rem; then we move b into a and the remainder into b. We continue this
        // process until b becomes 0. At that point, a contains the GCD, so the code
        // prints 10. In simple terms, the GCD of two numbers is the largest number that
        // divides both numbers exactly.
    }

    public static void linearSearch() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void binarySearch() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 5;

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                System.out.println("FOund");
                return;
            }

            else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Not found");
    }

    public static void searchRotated() {

    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void rotateKPlaceRIght(int arr[], int k) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("CHala ja yaha se");
            return;
        }
        k = k % n;

        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static  void rotateKPlaceLeft(int arr[], int k){
        int n = arr.length;
        if(n==0){
            return;
        }

        k = k %n;

        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        // fib();
        // prime();
        // gcd();
        // linearSearch();
        // binarySearch();
        // rotateKPlaceRIght(arr, 2);
        rotateKPlaceLeft(arr, 2);

    }

}

// Remove duplicates
// Merge arrays
// Rotate array
// Move zeroes
// Find missing number
// Find common elements
// Maximum contiguous subarray sum
// Two Sum

// Reverse a string
// Find duplicate characters
// Remove duplicate characters
// Find first non-repeating character
// Find substring
// Replace characters
// Reverse words
// Compare two strings
// Find longest word
