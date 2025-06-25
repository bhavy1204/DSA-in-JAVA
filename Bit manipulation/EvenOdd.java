public class EvenOdd {
    public static void isEvenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        isEvenOrOdd(2);
        isEvenOrOdd(3);
        isEvenOrOdd(76543);
        isEvenOrOdd(7210);
    }
}
