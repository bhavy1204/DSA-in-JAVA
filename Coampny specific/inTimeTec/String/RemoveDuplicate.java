
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Hello World";

        // Set<Character> seen = new HashSet<>();
        // StringBuilder ans = new StringBuilder();

        // for (char ch : str.toCharArray()) {
        // if (ch !=' ' ) {
        // if (seen.add(ch)) {
        // ans.append(ch);
        // }
        // }else{
        // ans.append(' ');
        // }
        // }
        // System.out.println(ans.toString());

        // ====================================================================================

        // Set<Character> seen = new HashSet<>();
        // StringBuilder res = new StringBuilder();

        // for (char ch : str.toCharArray()) {
        // if (ch != ' ') {
        // if (!seen.contains(ch)) {
        // seen.add(ch);
        // res.append(ch);
        // }
        // }else{
        // res.append(' ');
        // }

        // }

        // System.out.println(res.toString());

        // ====================================================================================

        // StringBuilder res = new StringBuilder();

        // boolean seen[] = new boolean[256];

        // for (char ch : str.toCharArray()) {
        // if (ch != ' ') {
        // if (!seen[ch]) {
        // seen[ch] = true;
        // res.append(ch);
        // }
        // }else{
        // res.append(' ');
        // }

        // }

        // System.out.println(res.toString());

        // ====================================================================================

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (res.indexOf(String.valueOf(ch)) == -1) {
                    res.append(ch);
                }
            }else{
                res.append(' ');
            }
        }

        System.out.println(res.toString());
    }
}
