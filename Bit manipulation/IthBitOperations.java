public class IthBitOperations {

    public static void getIthBit(int i, int n) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println("O hai bhai");
        } else {
            System.out.println("1 hai bhai");
        }
    }

    public static void setIthBit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println((n | bitMask) + " is new number");

    }

    public static void clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        System.out.println((n & bitMask) + " is the new number");
    }

    public static void updateIthBit(int n, int i, int bit) {
        if (bit == 0)
            clearIthBit(n, i);
        else
            setIthBit(n, i);
    }

    public static void updateIthBit2(int n, int i, int bit) {
        int bitMask = ~(1 << i);
        n = n & bitMask;
        bitMask = bit << i;
        System.out.println((n | bitMask) + " is the new number");

    }

    public static void clearLastIBits(int n, int i) {
        int bitMask = ((~0) << i);
        System.out.println((n&bitMask)+" is the new number");
    }

    public static void main(String[] args) {
        // getIthBit(355, 10); //Try this as well and observe output :)
        // getIthBit(3, 11);
        // getIthBit(2, 10);
        // setIthBit(12, 1);
        // clearIthBit(12, 3);
        // updateIthBit2(10, 1, 0);
        clearLastIBits(15, 2);
    }
}
