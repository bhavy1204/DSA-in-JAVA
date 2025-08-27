import java.util.*;

public class ChocolaProblem {

    public static void minCost(int n, int m, Integer ver[], Integer hor[]) {
        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < hor.length && v < ver.length) {
            if (ver[v] <= hor[h]) {
                cost += (hor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (ver[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < hor.length) {
            cost += (hor[h] * vp);
            hp++;
            h++;
        }

        while (v < ver.length) {
            cost += (ver[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Min cost : " + cost);

    }

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer vertical[] = { 2, 1, 3, 1, 4 };
        Integer horizontal[] = { 4, 1, 2 };

        minCost(n, m, vertical, horizontal);
    }
}
