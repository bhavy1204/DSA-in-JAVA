import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static void selectActivity(int start[], int end[]) {
        // 1 because atleast 1 task will be selected whchihc is the first one
        int maxActivity = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // Now assuming that the arrays are not sorted we will create a 2d array of size
        // (N x 3)
        int activity[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        // In the lambda function we are telling it to sort on basis of column 2. which
        // is the ending idx.
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        // i is the idx which we are storing.
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];

        for (int i = 0; i < end.length; i++) {
            // Matlab ki next task ki start tabhi hogi na jab mere current task ke end time
            // se ya to barabar ho ya badi ho. Baki me usko nhi kar paung.
            if (activity[i][1] >= lastEnd) {
                maxActivity++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }

        System.out.println("max activity : " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        selectActivity(start, end);
    }
}
