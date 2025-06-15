import java.util.*;

public class basicOfArrays {
    // taking array as arg
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // returning arr from method
    public static int[] update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;
        }
        return arr;
    }

    // linear search
    public static int linearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == val)
                return i;
        return -1;
    }

    // string linear search
    public static int stringLinearSearch(String arr[], String val) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(val)) {
                return i;
            }
        return -1;
    }

    // largest
    public static int largestInArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // binary search
    public static int binarySearch(int arr[], int val) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == val)
                return mid;
            if (val < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Creating array
        // dataType arrayName[] = new datatype[size];
        int size = input.nextInt();
        int marks[] = new int[size];
        // int marks2[] = {10,20,30};
        // String fruits[] = {"apple", "guava", "grapes"};

        // input
        for (int i = 0; i < size; i++)
            marks[i] = input.nextInt();
        System.out.println("--------------------------");

        // Output
        for (int i = 0; i < size; i++)
            System.out.println(marks[i]);

        // update
        marks[3] = input.nextInt();

        System.out.println("--------------------------");

        display(marks);

        System.out.println("--------------------------");
        int marks2[] = update(marks);
        display(marks2);

        int idx = linearSearch(marks2, 11);
        System.out.println("Found 11 at idx : " + idx);

        input.nextLine();

        String menu[] = { "samosa", "pavbhaji", "dosa", "kachori" };
        String key = input.nextLine();
        idx = stringLinearSearch(menu, key);
        System.out.println(idx);

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int largest = largestInArray(numbers);
        System.out.println("\nLargest in array  : " + largest);
        idx = binarySearch(numbers, 7);
        System.out.println("Found by BS : "+idx);
        input.close();

    }
}
