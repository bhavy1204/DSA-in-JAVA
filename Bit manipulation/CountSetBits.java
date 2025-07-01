public class CountSetBits {
    public static void countBits(int n){
        int cnt=0;

        while (n>0) {
            if((n&1)!=0)
                cnt++;
            n = n>>1;
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        countBits(7);
    }
}
