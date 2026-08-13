public class RearrangeSign {

    public static void rearrangeSign(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];

        int posIdx = 0;
        int negIdx = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[negIdx] = arr[i];
                negIdx += 2;
            } else {
                ans[posIdx] = arr[i];
                posIdx += 2;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, -1, -2, -3 };

        rearrangeSign(arr);

    }
}
