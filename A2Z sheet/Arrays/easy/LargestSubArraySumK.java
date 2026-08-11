public class LargestSubArraySumK {

    public static void largestSubArray(int arr[], int sum) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSUm = 0;
                for (int k = i; k <= j; k++) {
                    currSUm += arr[k];
                }

                if (currSUm == sum) {
                    max = Math.max(max, j - i + 1);
                    // for (int k = i; k <=j; k++) {
                    // System.out.print(arr[k]);
                    // }
                    // System.out.println("-----------------------------------");
                }
            }
        }

        System.out.println(max);
    }

    public static int largestSUbArray(int arr[], int k) {
        int maxLen = 0;
        int n = arr.length;

        int left = 0, right = 0;

        int sum=arr[0];

        while (right < n) {
            while (left<=right && sum >k) {
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
            if (right<n) {
                sum+=arr[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(largestSUbArray(arr, k));
    }
}
