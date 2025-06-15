public class SubArray {
    public static void subArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int cnt = 0,sum=0,minStart=-1,minEnd=-1,maxStart=-1,maxEnd=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    if(sum>maxSum){
                        maxStart = i;
                        maxEnd=j;
                        maxSum=sum;
                    }
                    if(sum<minSum){
                        minStart = i;
                        minEnd=j;
                        minSum=sum;
                    }
                }
                cnt++;
                sum=0;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total sub arrays : "+cnt);
        System.out.println("Min sum : "+minSum);
        System.out.println("Min sub array :- ");
        for (int i = minStart; i < minEnd; i++) 
            System.out.print(arr[i]+" ");
        System.out.println("Max sum : "+maxSum);
        for (int i = maxStart; i < maxEnd; i++) 
            System.out.print(arr[i]+" ");
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        subArray(num);
    }
}
