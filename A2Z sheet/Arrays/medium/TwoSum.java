import java.util.*;

public class TwoSum {
    public static void twoSumBruteForce(int arr[], int target){
        int n = arr.length;

        for (int i = 0; i <n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Founded");
                    return;
                }
            }
        }

    }

    public static int[] twoSumBetter(int arr[], int target) {
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target-arr[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }

            map.put(arr[i], i);
        }

        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int arr[]={ 2, 7, 11, 15};
        int target = 9;
        twoSumBruteForce(arr, target);
    }
}