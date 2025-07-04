public class IncreasingDecreasingOrder {
    public static void decreasingPrint(int n) {
        System.out.print(n + " ");
        if (n == 1)
            return;
        decreasingPrint(n - 1);
    }

    public static void increasingPrint(int n) {
        System.out.print(n + " ");
        if (n == 10)
            return;
        increasingPrint(n + 1);
    }

    public static int fact(int n){
        if(n<=1)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        decreasingPrint(10);
        increasingPrint(0);
        System.out.println("\nFactorial : "+fact(5));
        System.out.println("Sum : ");
    }
}
