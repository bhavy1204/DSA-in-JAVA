public class FirstAndLastOccurence {

    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;
        int isFound = lastOccurence(arr, i + 1, key);
        return (isFound == -1 && arr[i] == key) ? i : isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 7 };
        System.out.println(firstOccurence(arr, 0, 6));
        System.out.println(lastOccurence(arr, 0, 6));
    }
}
