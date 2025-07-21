public class Subsets {
    public static void getSubsets(String str, String subset, int idx, int val) {
        if (idx == str.length()) {
            System.out.println(subset);
            return;
        }
        getSubsets(str, subset+str.charAt(idx), idx+1, val+1);
        getSubsets(str, subset, idx+1, val+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        getSubsets(str, "", 0, 0);
    }
}
