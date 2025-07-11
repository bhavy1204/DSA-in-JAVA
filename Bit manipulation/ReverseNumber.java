public class ReverseNumber {
    public static void reverseNumber(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r = (r << 1) | (n & 1);
            n = n >> 1;
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        reverseNumber(23);
    }
}
