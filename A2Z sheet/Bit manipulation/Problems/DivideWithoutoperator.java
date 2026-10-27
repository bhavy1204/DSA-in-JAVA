public class DivideWithoutoperator {
    public static int divideWithoutoperator(int dividend, int divisor){
        if (dividend == divisor) {
            return 1;
        }
        boolean sign = true;

        if (dividend>=0 && divisor<0) {
            sign = false;
        }

        if (dividend<=0 && divisor>0) {
            sign = false;
        }

        long n = Math.abs(dividend);
        long d = Math.abs(divisor);

        int ans =0;

        while (n>=d) {
            int cnt =0;
            while (n>=(d<<(cnt+1))) {
                cnt++;
            }
            ans+=1<<cnt;
            n = n - (d * (1<<cnt));


        }

        if (ans>= Integer.MAX_VALUE && sign==true) {
            return  Integer.MAX_VALUE;
        }

        if (ans>= Integer.MAX_VALUE && sign==false) {
            return  Integer.MIN_VALUE;
        }


        return sign? ans: (-1 * ans);
    }
    public static void main(String[] args) {
        int dividend = 22, divisor = 4;
        System.out.println(divideWithoutoperator(dividend, divisor));
    }
}