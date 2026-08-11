public class LongestSubArrayWIthZeroSum {

    public static int longestSubArrayWIthZeroSum1(int arr[], int n){
        int maxLen=0;
        int sum;
        for (int i = 0; i < n; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==0){
                    maxLen= Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static int longestSubArrayWIthZeroSum2(int arr[], int k) {
        int maxLen = 0;

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] ={ 9,-3,3,-1,6,-5};

        int K = arr.length;

        System.out.println(longestSubArrayWIthZeroSum1(arr, K));
        // System.out.println(longestSubArrayWIthZeroSum2(arr, K));

    }
}
