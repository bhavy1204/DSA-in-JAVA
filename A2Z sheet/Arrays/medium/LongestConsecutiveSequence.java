import java.util.*;

public class LongestConsecutiveSequence {


    public static boolean linearSearch(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return true;
            }
        }
        return false;
    }
    public static void LCS_BruteForce(int arr[]){
        int longest =1;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int cnt =0;
            while (linearSearch(arr, x+1)==true) {
                x+=1;
                cnt+=1;
            }

            longest = Math.max(longest, cnt);

        }

        System.out.println(longest);
    }

    public static void LCS_Optimal(int arr[]){
        int longest =1;

        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }

        for (int it : st) {
            if(!st.contains(it-1)){
                int cnt =1;

                int x = it;

                while (st.contains(x+1)) {
                    x += 1;
                    cnt +=1;
                }

                longest= Math.max(cnt, longest);
            };
        }

        System.out.println(longest);
    }


    public static void main(String[] args) {
        int arr[]={100, 4, 200, 1, 3, 2};

        // LCS_BruteForce(arr);
        LCS_Optimal(arr);
    }   
}
