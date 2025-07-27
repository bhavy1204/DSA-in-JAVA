import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        mainList.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);
        l2.add(10);
        mainList.add(l2);

        // for (int i = 0; i < mainList.size(); i++) {
        //     for (int j = 0; j < mainList.get(i).size(); j++) {
        //         System.out.print(mainList.get(i).get(j) + " ");
        //     }
        //     System.out.println("");
        // }

        ArrayList<ArrayList<Integer>> tables= new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        ArrayList<Integer> t4 = new ArrayList<>();
        ArrayList<Integer> t5 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            t1.add(i*1);
            t2.add(i*2);
            t3.add(i*3);
            t4.add(i*4);
            t5.add(i*5);
        }

        tables.add(t1);
        tables.add(t2);
        tables.add(t3);
        tables.add(t4);
        tables.add(t5);

        for (int i = 0; i < tables.size(); i++) {
            for (int j = 0; j < tables.get(i).size(); j++) {
                System.out.print(tables.get(i).get(j)+" ");
            }
            System.out.println("");
        }

    }
}
