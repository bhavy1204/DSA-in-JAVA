 class SingleNumber2{

    public static int singleNumber2(int arr[]){
        int ones=0;
        int twos=0;
        for (int i = 0; i < arr.length; i++) {
            ones= (ones^arr[i]) & (~twos);
            twos = (twos ^ arr[i]) & (~ones);
        }

        return  ones;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,1,1,1,3,3,3};
        System.out.println(singleNumber2(arr));
    }
}
