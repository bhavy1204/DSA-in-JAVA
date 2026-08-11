public class SortedArray {

    public static boolean isSorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]> arr[i+1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 9, 36, 82, 80, 84, 5, 0, 2, 1, 4, 5, 83 };

        System.out.println(isSorted(arr));
        
    }
}
