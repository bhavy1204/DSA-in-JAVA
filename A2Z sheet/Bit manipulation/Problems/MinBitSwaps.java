public class MinBitSwaps {

    public static int noOfBitSwaps(int start, int goal){
        int cnt =0; 
        int temp = start^goal;

        while (temp!=0) { 
            temp = temp & temp-1;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(noOfBitSwaps(10, 7));
    }
}
