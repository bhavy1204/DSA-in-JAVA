public class BinaryPatterns {

    public static void square() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print((i+j)%2==0?"1 ":"0 ");
            System.out.println("");
        }
    }

    public static void triangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // triangle();
        square();
    }
}
