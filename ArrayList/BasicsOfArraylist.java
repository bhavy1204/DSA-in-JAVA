import java.util.*;

public class BasicsOfArraylist {
    public static void main(String[] args) {
        // String, Boolean, Float,
        ArrayList<Integer> mylist = new ArrayList<>();
        // System.out.println(mylist.size());
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        // to print
        System.out.println("List : " + mylist);

        // size
        System.out.println("Size : " + mylist.size());

        // idx =2
        System.out.println("get elem. on idx 2 : " + mylist.get(2));

        // deleteing at idx = 2
        System.out.println("Deleting on idx 2 : " + mylist.remove(2));
        System.out.println("List now " + mylist);
        System.out.println("Size : " + mylist.size());

        // Set at idx = 2
        System.out.println("Set 100 at idx 2 : " + mylist.set(2, 100));
        System.out.println("List now " + mylist);
        System.out.println("Size : " + mylist.size());

        // contains
        System.out.println("contains 20 ? : " + mylist.contains(20));
        System.out.println("contains 100 ? : " + mylist.contains(100));

        // adding in betwen
        mylist.add(3, 50);
        System.out.println("Adding 50 at idx 3 :" + mylist);
        System.out.println("Size now : " + mylist.size());

        // USing loop for iteration
        System.out.println("Loop for printing:- ");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i) + " ");
        }

        // Reverse
        System.out.println("\nReverse Loop for printing:- ");
        for (int i = mylist.size() - 1; i >= 0; i--) {
            System.out.print(mylist.get(i) + " ");
        }

        // Max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mylist.size(); i++)
            // max = Math.max(max, mylist.get(i));
            if (mylist.get(i) > max)
                max = mylist.get(i);
        System.out.println("\nMax value : " + max);

        // swap idx 2 and 5;
        System.out.println("Before swap : " + mylist);
        int temp = mylist.get(2);
        mylist.set(2, mylist.get(5));
        mylist.set(5, temp);
        System.out.println("After swap : " + mylist);

        // Sorting
        System.out.println("Before sorting" + mylist);
        Collections.sort(mylist);
        System.out.println("After sorting (asce.) " + mylist);
        Collections.sort(mylist, Collections.reverseOrder());
        System.out.println("After sorting (desc.) " + mylist);
    }
}
