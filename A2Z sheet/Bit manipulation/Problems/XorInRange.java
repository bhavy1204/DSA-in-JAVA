public class XorInRange {
    public static int xor(int n) {
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        if (n % 4 == 3) {
            return 0;
        }
        return n;

    }

    public static int xorInRange(int l, int r) {
        return xor(l - 1) ^ xor(r);
    }

    public static void main(String[] args) {
        int l = 1, r = 4;
        System.out.println(xorInRange(l, r));

    }
}
