public class LongestWord {
    public static void main(String[] args) {
        String str = "This is the STring that I am writing by my own hands amdthisislastword";

        //====================================================================================
        // int max=Integer.MIN_VALUE;
        // int cnt=0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i)!=' ') {
        //         cnt++;
        //     }else{
        //         max = Math.max(cnt, max);
        //         cnt=0;
        //     }
        // }
        // max = Math.max(max, cnt);
        // System.out.println(max);


        //====================================================================================
        int max=0;

        String[] words = str.split(" ");

        for(String word : words){
            max = Math.max(max, word.length());
        }

        System.out.println(max);
    }
}
