public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si+(ei - si) / 2;
        // left
        mergeSort(arr, si, mid);
        // right
        mergeSort(arr, mid + 1, ei);

        // Merging the sorted array 
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i]<arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        //left part 
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        //left part 
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // copying temp to arr
        for (k = 0, i = si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        print(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted arry:- ");
        print(arr);
    }
}

// This type of sorting techniques is called Depth first because we are going in depth (till size is 1) and than sorting that part than again doing the same recursively for whole array.