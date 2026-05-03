public class Maths {

    static int countNumbers(int n) {
        // int cnt = 0;
        // while (n>0) {
        // n/=10;
        // cnt++;
        // }
        // return cnt;

        // Optimized:

        int cnt = (int) (Math.log10(n) + 1);

        return cnt;
    }

    static int reverseNum(int n) {
        int rev = 0;

        while (n > 0) {
            rev *= 10;
            rev += n % 10;
            n /= 10;
        }

        return rev;
    }

    static boolean palindrome(int n) {
        int rev = 0, duplicate = n;

        while (n > 0) {
            rev *= 10;
            rev += n % 10;
            n /= 10;
        }

        return rev == duplicate;
    }

    static boolean armstrong(int n) {

        int digits = (int) (Math.log10(n) + 1);
        int result = 0, duplicate = n;

        while (n > 0) {
            int a = n % 10;
            result += (int) (Math.pow(a, digits));
            n /= 10;
        }

        return result == duplicate;
    }

    static void divisors(int n) {
        // for (int i = 1; i < n; i++) {
        // if(n%i==0){
        // System.out.print(i +" , ");
        // }
        // }

        // optimized

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " , ");
            }

            if (i != n / i) {
                System.out.print(n / i + " , ");
            }
        }

    }

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        // for (int i = 2; i < n; i++) {
        // if(n%i==0){
        // return false;
        // }
        // }
        // return true;

        // Optimal

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int gcd(int a, int b) {
        // int min = Math.min(a, b);

        // for (int i = min; i >= 1; i--) {
        // if (a % i == 0 && b % i == 0)
        // return i;
        // }

        // return 1;

        // Optimized

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 7;

        // System.out.println(countNumbers(n));
        // System.out.println(reverseNum(n));
        // System.out.println(palindrome(n));
        // System.out.println(armstrong(n));
        // divisors(n);
        System.out.println(isPrime(n));
        System.out.println(gcd(12, 18));
    }
}
