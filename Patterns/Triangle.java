public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        char ch='A';
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print((ch++)+" ");
            }
            System.out.println("");
        }
    }
}