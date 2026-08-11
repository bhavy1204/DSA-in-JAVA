public class OneApperance {

    public static int findOneApperance(int arr[]){

        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] hash = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(hash[arr[i]] == 1){
                return arr[i];
            }
        }

        return -1;

    }

    public static int findOneApperance2(int arr[]){
        int xor= 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
    
        return xor;

    }

    


    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2,4,5};

        System.out.println(findOneApperance2(arr));
    }
}