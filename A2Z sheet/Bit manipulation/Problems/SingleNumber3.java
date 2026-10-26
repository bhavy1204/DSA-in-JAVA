public class SingleNumber3 {

    public static void singleNumber3(int nums[]) {
        long xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        long rightMostBit = (xor & xor - 1) ^ xor;

        int bucket1 = 0;
        int bucket2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & rightMostBit) == 0) {
                bucket1 = bucket1 ^ nums[i];
            } else {
                bucket2 = bucket2 ^ nums[i];
            }
        }

        System.out.println(bucket1 + " , " + bucket2);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4,4, 2, 6,13, 3, 7, 7, 3 };
        singleNumber3(arr);
    }
}
