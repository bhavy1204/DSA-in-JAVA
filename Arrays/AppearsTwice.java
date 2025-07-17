public class AppearsTwice {
    public static boolean checkDuplicate(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,4,3};
        System.out.println(checkDuplicate(arr));
    }
}
