public class ReplaceChar {
    public static void main(String[] args) {
        String str = "This is a STring";
        char target = 'a', replace='b';

        // str = str.replace(c, replace);

        // System.out.println(str);
            

        //====================================================================================

        // StringBuilder res = new StringBuilder();

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     if (ch == target) {
        //         res.append(replace);
        //     }else{
        //         res.append(ch);
        //     }
        // }

        // System.out.println(res.toString());


        //====================================================================================

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== target) {
                arr[i]= replace;
            }
        }

        str = new String(arr);

        System.out.println(str);


    }
}
