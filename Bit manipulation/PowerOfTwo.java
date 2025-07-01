public class PowerOfTwo {
    public static void isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0)
            System.out.println("yes the number is pow of 2 ");
        else
            System.out.println("No the num is not pow of 2 ");
    }

    public static void main(String[] args) {
        isPowerOfTwo(256);
    }
}
