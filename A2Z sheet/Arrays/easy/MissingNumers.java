public class MissingNumers {
    public static int findMissingNumber(int arr[]) {
        int sum = 0, expectedSum = 0, n = arr.length+1;

        expectedSum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return expectedSum - sum;
    }

    public static int findMissingNumber2(int arr[]) {
        int n = arr.length +1;
        int XOR1 = 0 , XOR2=0;

        for (int i = 0; i < n-1; i++) {
            XOR1 ^= arr[i];   
        }

        for (int i = 1; i <= n; i++) {
            XOR2 ^=i;
        }

        return XOR1 ^ XOR2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
        System.out.println(findMissingNumber2(arr));
    }
}
