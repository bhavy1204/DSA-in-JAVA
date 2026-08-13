public class SortArrays {
    public static void sortZeroOneTwo(int arr[]) {
        int cnt0=0, cnt1=0, cnt2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
            if (arr[i] == 1) {
                cnt1++;
            }
            if (arr[i] == 2) {
                cnt2++;
            }

            
        }

        int idx = 0;

        while (cnt0-- > 0) {
            arr[idx++] = 0;
        }

        while (cnt1-- > 0) {
            arr[idx++] = 1;
        }

        while (cnt2-- > 0) {
            arr[idx++] = 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 1, 0, 1, 2, 0 };
        sortZeroOneTwo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
