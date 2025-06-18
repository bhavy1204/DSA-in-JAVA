public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 2, 9, 5, 8, 4, 7 };
        selectionSort(arr);
    }   
}
