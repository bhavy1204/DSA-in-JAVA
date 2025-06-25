public class Rhombus {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 15; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
