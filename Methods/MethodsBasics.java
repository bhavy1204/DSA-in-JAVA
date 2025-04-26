class MethodsBasics {
    int Product(int a, int b) {
        return a * b;
    }

    int factByRecu(int n) {
        return (n == 0) ? 1 : n * factByRecu(n - 1);
    }

    int factByLoop1(int n) {
        int res = 1;
        for (int i = n; i >= 1; i--)
            res *= i;
        return res;
    }

    int factByLoop2(int n) {
        int res = 1;
        while (n >= 1)
            res *= n--;
        return res;
    }

    int binomialCoff(int n, int r) {
        return factByRecu(n) / (factByLoop1(r) * (factByLoop2(n - r)));
    }

    double sum(int a, int b) {
        return a + b;
    }

    double sum(int a, float b, int c) {
        return a + c + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    Boolean isPrime(int n) {
        if (n == 1 || n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    Boolean isPrime2(int n) {
        if (n == 1 || n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    void primeInRange(int start, int end) {
        for (int i = start; i < end; i++) {
            if (isPrime2(i))
                System.out.print(i + " ");
        }
    }

    int binaryToDecimal(int n) {
        int decimal = 0, i = 0;
        while (n != 0) {
            decimal += n % 10 * (int) Math.pow(2, i++);
            n /= 10;
        }
        return decimal;
    }

    StringBuilder decimalToBinary(int n) {
        String binary = "";
        while (n != 0) {
            if (n % 2 == 0)
                binary += "0";
            else
                binary += "1";
            n /= 2;
        }
        StringBuilder rev = new StringBuilder(binary);
        rev.reverse();
        return rev;
    }

    int decimalToBinary2(int n) {
        int binary = 0, p = 0;
        while (n != 0) {
            binary += n % 2 * (int) Math.pow(10, p++);
            n /= 2;
        }
        return binary;
    }

    boolean isPalindrome(int n) {
        int rev = 0,orig=n;
        while (n != 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        return (rev == orig) ? true : false;
    }

    int sumOfNum(int n){
        int sum=0;
        while (n!=0) {
            sum +=n%10;
            n/=10;
        }
        return sum;
    }

    void mathClassmethods(int n){
        System.err.println(Math.abs(n));
        System.err.println(Math.pow(2,n));
        System.err.println(Math.min(10, n));
        System.err.println(Math.max(10, n));
        System.err.println(Math.sqrt(n));
    }

    public static void main(String[] args) {
        MethodsBasics obj = new MethodsBasics();
        System.out.println(obj.Product(10, 20));
        System.out.println(obj.factByRecu(5));
        System.out.println(obj.factByLoop1(5));
        System.out.println(obj.factByLoop2(5));
        System.out.println(obj.binomialCoff(5, 2));
        System.out.println("------------ METHOD OVERLOADING ------------");
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10, (float) (32.12), 43));
        System.out.println(obj.sum(32.65, 54.86));
        System.out.println("isPrime : 5 : " + (obj.isPrime(5) ? "YES" : "NO"));
        System.out.println("isPrime : 7 : " + (obj.isPrime(7) ? "YES" : "NO"));
        System.out.println("isPrime : 10 : " + (obj.isPrime(10) ? "YES" : "NO"));
        System.out.println("-----");
        System.out.println("isPrime2 : 5 : " + (obj.isPrime2(5) ? "YES" : "NO"));
        System.out.println("isPrime2 : 7 : " + (obj.isPrime2(7) ? "YES" : "NO"));
        System.out.println("isPrime2 : 10 : " + (obj.isPrime2(10) ? "YES" : "NO"));
        System.out.println("-PRIME IN RANGE FROM 1 TO 20---------");
        obj.primeInRange(10, 20);
        System.out.println("-----------Binary to Deciaml-------------------");
        System.out.println(obj.binaryToDecimal(101));
        System.out.println(obj.binaryToDecimal(1010));
        System.out.println(obj.binaryToDecimal(11010));
        System.out.println("-----------Decimal to binary-------------------");
        System.out.println(obj.decimalToBinary(5));
        System.out.println(obj.decimalToBinary(10));
        System.out.println(obj.decimalToBinary(26));
        System.out.println(obj.decimalToBinary(1));
        System.out.println("-----------Decimal to binary another way-------------------");
        System.out.println(obj.decimalToBinary2(5));
        System.out.println(obj.decimalToBinary2(10));
        System.out.println(obj.decimalToBinary2(26));
        System.out.println(obj.decimalToBinary2(1));
        System.out.println("----------Is palindrome-------------------");
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(64));
        System.out.println("---------- Sum of Number ------------------");
        System.out.println(obj.sumOfNum(123));
        System.out.println(obj.sumOfNum(12345));
    }
}