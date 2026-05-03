public class Recurssion {

    static void nNames(int n, String name) {
        if (n <= 0) {
            return;
        }

        System.out.println(name);

        nNames(n - 1, name);

    }

    static void printToN(int n, int curr) {
        if (curr > n) {
            return;
        }

        System.out.println(curr);

        printToN(n, curr + 1);
    }

    static void printToNBackTracking(int n, int curr) {
        if (curr > n) {
            return;
        }

        printToN(n, curr + 1);

        System.out.println(curr);

    }

    static void printNto1(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);

        printNto1(n - 1);
    }

    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static boolean isPalindrom(int i, String s){
        if(s.length()==0){
            return false;
        }

        if(i>= s.length()/2){
            return true;
        }

        if(s.charAt(i ) != s.charAt(s.length()- i-1)){
            return false;
        }

        return isPalindrom(i+1, s);
    }

    public static void main(String[] args) {
        // nNames(5, "Bhavy");
        // printToN(10, 1);
        // printNto1(10);
        // System.out.println(sum(5));
        // System.out.println(fact(5));
        System.out.println(isPalindrom(0, "cffc"));

    }
}