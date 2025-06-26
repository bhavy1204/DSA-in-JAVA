public class ClearRangeOfBits {
    public static void clearBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println((n & bitMask) + " is the new number");
    }

    public static void main(String[] args) {
        clearBits(10, 2, 4);
    }
}
