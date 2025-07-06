public class XtoThePowerN {
    public static int power(int x, int n) {
        if (n == 1)
            return x;
        return x * power(x, n - 1);
    }

    public static int power2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        int ans = halfPower * halfPower;
        if (n % 2 != 0)
            ans *= x;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(power2(2, 10));
    }
}
