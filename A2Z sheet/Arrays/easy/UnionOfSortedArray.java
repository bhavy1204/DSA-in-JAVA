import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {

    public static void unionPointers(int arr1[], int arr2[]) {

        List<Integer> Union = new ArrayList<>();

        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if(arr1[i]<arr2[j]){
                if(Union.isEmpty() || Union.get(Union.size() -1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j++]);
                }
                j++;
            }else{
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++; j++;
            }
        }

        while (i<m) {
            Union.add(arr1[i]);
            i++;
        }

        while (j<n) {
           Union.add(arr2[j]);
           j++; 
        }

        System.out.println(Union);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 6, 8, 9, 10 };

        unionPointers(arr1, arr2);
    }
}
