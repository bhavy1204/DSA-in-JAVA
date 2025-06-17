public class MaxSumOfSubArray {
    public static void bruteForce(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int cnt = 0, sum = 0, minStart = -1, minEnd = -1, maxStart = -1, maxEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    if (sum > maxSum) {
                        maxStart = i;
                        maxEnd = j;
                        maxSum = sum;
                    }
                    if (sum < minSum) {
                        minStart = i;
                        minEnd = j;
                        minSum = sum;
                    }
                }
                cnt++;
                sum = 0;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total sub arrays : " + cnt);
        System.out.println("\nMin sum : " + minSum);
        System.out.println("\nMin sub array :- ");
        for (int i = minStart; i <= minEnd; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nMax sum : " + maxSum);
        for (int i = maxStart; i <= maxEnd; i++)
            System.out.print(arr[i] + " ");

    }

    public static void prefixSum(int arr[]) {
        int currSUm = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSUm = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSUm)
                    maxSum = currSUm;
            }
        }

        System.out.println("MAximum sum : " + maxSum);
    }

    public static void kadaneAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxNeg = Integer.MIN_VALUE;
        boolean allNeg=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                allNeg = false;
                break;
            }
            maxNeg = Math.max(maxNeg, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0)
                currSum = 0;
            maxSum = Math.max(maxSum, currSum);
        } 
        System.out.println("Maximum sum : " + (allNeg? maxNeg: maxSum));
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, -4, -1, 5, -3 };
        // bruteForce(num);
        // prefixSum(num);
        kadaneAlgo(num);
    }
}
