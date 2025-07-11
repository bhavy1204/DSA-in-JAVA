public class SearchRotatedSortedArray {
    public static int givePos(int arr[], int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=target && target<= arr[mid]) {
                return givePos(arr, si, mid-1, target);
            } else {
                return givePos(arr, mid+1, ei, target);   
            }
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return givePos(arr, mid+1, ei, target);
            }else{
                return givePos(arr, mid-1, ei, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.err.println(givePos(arr,0,arr.length-1,5));
    }
}
