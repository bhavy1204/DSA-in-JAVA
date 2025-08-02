import java.util.ArrayList;

public class PairSum2 {
    public static void optimizedPairSum2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(0);
        list.add(8);
        list.add(9);
        list.add(10);

        int bp = -1, sum = 0, target = 16;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
            }
        }

        int leftPtr = bp + 1;
        int rightPtr = bp;

        while (leftPtr != rightPtr) {
            sum = list.get(rightPtr) + list.get(leftPtr);
            if (sum > target) {
                rightPtr = (list.size() + rightPtr - 1) % list.size();
            } else if (sum < target) {
                leftPtr = (leftPtr + 1) % list.size();
            } else {
                System.out.println("Got idx >> " + leftPtr + " , " + rightPtr);
                break;
            }
            if (rightPtr == -1) {
                rightPtr = list.size() - 1;
            }
            if (leftPtr == list.size()) {
                leftPtr = 0;
            }
        }
    }

    public static void main(String[] args) {
        optimizedPairSum2();
    }
}
