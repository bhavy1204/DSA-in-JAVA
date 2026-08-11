public class MaxSumSubArray {


    public static void maxSumSubArray(int arr[]){
        int len=0 , sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                len++;
            }

        }

        System.out.println(len + " - " + sum);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,0,1,3,1,1} ;
        maxSumSubArray(arr);

    }
}
