import java.util.*;

public class ContainerWithMostWater {

    public static void mostWaterBruteForce() {
        ArrayList<Integer> heights = new ArrayList<>();
        int vol = 0;
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        for (int i = 0; i < heights.size() - 1; i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                vol = Math.max(vol, ((Math.min(heights.get(i), heights.get(j))) * (j - i)));
            }
        }
        System.out.println(vol);
    }

    public static void optimizedMostWaterBruteForce() {
        ArrayList<Integer> heights = new ArrayList<>();
        int vol = 0;
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        int lp = 0;
        int rp = heights.size() - 1;

        while (lp < rp) {
            int ht = Math.min(heights.get(lp), heights.get(rp));
            int current = ht * (rp - lp);
            vol = Math.max(vol, current);

            if (heights.get(lp) < heights.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println(vol);
    }

    public static void main(String[] args) {
        mostWaterBruteForce();
    }
}
