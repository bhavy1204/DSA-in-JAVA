public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,3,2,1,2,4};

        System.out.println(linearSearch(arr, 4));
    }
}
