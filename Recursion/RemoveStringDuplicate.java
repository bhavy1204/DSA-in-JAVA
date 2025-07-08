public class RemoveStringDuplicate {
    public static void removeDuplicate(int idx, StringBuilder newStr, boolean map[], String str) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            removeDuplicate(idx + 1, newStr, map, str);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(idx + 1, newStr.append(currentChar), map, str);
        }
    }

    public static void main(String args[]) {
        String s = "heeellllooolllwooorldd";
        removeDuplicate(0, new StringBuilder(""), new boolean[26], s);
    }
}
