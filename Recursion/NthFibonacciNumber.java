public class NthFibonacciNumber {

    public static int nThFibNum(int n){
        if( n==0 || n ==1 )
            return n;
        return nThFibNum(n-1) + nThFibNum(n-2);
    }

    // considering 0 as 1st number in series
    public static int nthFibNum2(int n){
        if(n==1)
            return 0;
        else if(n== 2)
            return 1;
        return nthFibNum2(n-1) + nthFibNum2(n-2);
    }

    public static void main(String[] args) {
        System.out.println(nThFibNum(6));
        System.out.println(nthFibNum2(7));
    }
}
