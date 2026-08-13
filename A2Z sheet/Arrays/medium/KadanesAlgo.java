public class KadanesAlgo {

    public static void kadanesAlgoBruteForce(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int j2 = i; j2 < j; j2++) {
                    sum+=arr[i];
                }
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }

    public static void kadanesAlgoBetter(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

    public static void kadanesAlgoOptimal(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];

            if(sum>max){
                max = sum;
            }

            if(sum<0){
                sum=0;
            }

        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 5, -2, 7, -4};
        // kadanesAlgoBruteForce(arr);
        // kadanesAlgoBetter(arr);
        kadanesAlgoOptimal(arr);
    }
}
