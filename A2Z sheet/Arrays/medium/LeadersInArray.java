import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void leadersInArray(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();

        if(arr.length==0){
            System.out.println("EMpty array");
            return;
        }

        int max = arr[arr.length-1];
        list.add(max);

        for (int i = arr.length-2; i >0; i--) {
            if (arr[i]>max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(list);

        for (Integer integer : list) {
            System.out.print(integer+" , ");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 10, 22, 12, 3, 0, 6};
        leadersInArray(arr);
    }   
}
