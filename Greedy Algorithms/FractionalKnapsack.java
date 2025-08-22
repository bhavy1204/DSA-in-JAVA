import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void fractionalKnapsack(int[] value, int[] weight, int w) {
        double ratio[][] = new double[value.length][2];
        int capacity = w;
        int ans = 0;

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int k = ratio.length - 1 ;  k >= 0; k--) {
            int idx = (int) ratio[k][0];
            if (capacity >= weight[idx]) {
                ans += value[idx];
                capacity -= weight[idx];
            } else {
                ans += ratio[k][1] * capacity;
                capacity = 0;
            }
        }

        System.out.println("Total : " + ans);
    }

    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int W = 50;
        fractionalKnapsack(value, weight, W);
    }
}
