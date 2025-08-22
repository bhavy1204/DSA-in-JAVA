import java.util.Arrays;

public class MinAbsoluteDiff {

    public static void minAbsoluteDiff(int[] arr1, int[] arr2){
        int sum =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            sum += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr1[] ={1,4,7,8};
        int arr2[] ={2,3,6,5};
        minAbsoluteDiff(arr1,arr2);
    }
}
