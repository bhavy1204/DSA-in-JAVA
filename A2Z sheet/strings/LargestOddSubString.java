public class LargestOddSubString {
    public static String largestOddSubString(String str){
        for (int i =  str.length()-1; i >=0; i--) {
            if((str.charAt(i) -'0')%2 !=0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String str ="34026";
        System.out.println(largestOddSubString(str));
    }
}
