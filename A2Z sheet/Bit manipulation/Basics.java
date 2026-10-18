public class Basics {

    public static void swap(int a, int b) {
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

    public static void ithBitSetOrNot(int n, int i) {
        if ((n & (1 << i)) != 0) {
            System.out.println("Set");
        } else {
            System.out.println("Not set");
        }
    }

    public static void setIthBit(int n, int i) {
        System.out.println(n | (1 << i));
    }

    public static void clearIthBit(int n, int i) {
        System.out.println(n & ~(1 << i));
    }

    public static void toggleIthBit(int n, int i) {
        System.out.println(n ^ (1 << i));
    }

    public static void removeLastSetBit(int n) {
        System.out.println(n & (n - 1));
    }

    public static void powerOfTwo(int n) {
        System.out.println((n & (n - 1)) == 0 ? "true" : "False");
    }

    public static void countSetBits(int n) {
        int cnt =0;
        while (n>1) {
            if(n%2==1){
                cnt++;
            }
            n/=2;
        }
        if(n==1){
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void countSetBits2(int n) {
        int cnt = 0;
        while (n!=0) {
            n = n & n-1;
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        // swap(10, 20);
        // ithBitSetOrNot(13, 1);
        // setIthBit(13, 1);
        // clearIthBit(13, 2);
        // toggleIthBit(13, 1);
        // removeLastSetBit(13);
        // powerOfTwo(17);
        // countSetBits(13);
        countSetBits2(13);



    }
}
