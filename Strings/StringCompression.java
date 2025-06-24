public class StringCompression {
    public static String compress(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            Integer cnt = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                i++;
            }
            newStr += s.charAt(i);
            if (cnt > 1)
                newStr += cnt.toString();
        }

        return newStr;
    }

    public static String compress2(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int cnt =1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(cnt>1)
                newStr.append(cnt);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaaaaaaaavvvvvvvvvvvbccccdddaaaafffdddddddddddddddz";
        String reqStr = compress2(str);
        System.out.println(reqStr);
    }
}
