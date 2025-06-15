public class SubArray {
    public static void subArray(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");
                cnt++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total sub arrays : "+cnt);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        subArray(num);
    }
}
