public class IndianCoins {

    public static void minCoin(int val) {
        int arr[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < val) {
                while (arr[i] <= val) {
                    System.out.println("amount : " + arr[i]);
                    count++;
                    val -= arr[i];
                }
            }
        }

        System.out.println("Total Notes required : " + count);
    }

    public static void main(String[] args) {
        int val = 590;
        minCoin(val);
    }
}
