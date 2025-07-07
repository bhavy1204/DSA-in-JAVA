public class TilingProblem {
    public static int noOfWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int verticalWays = noOfWays(n - 1);

        int horizontalWays = noOfWays(n - 2);

        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }
}
