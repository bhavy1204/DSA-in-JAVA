public class BuyAndSellStocks {

    public static void buyAndSellStcoksBruteForce(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];

                max = Math.max(max, profit);
            }
        }
        if (max < 0) {
            max = 0;
        }
        System.out.println(max);
    }

    public static void buyAndSellStcoksGreedy(int arr[]) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minPrice){
                minPrice= arr[i];
            }else{
                maxProfit = Math.max(maxProfit, arr[i]-minPrice);
            }
        }

        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        // buyAndSellStcoksBruteForce(arr);
        buyAndSellStcoksGreedy(arr);
    }
}
