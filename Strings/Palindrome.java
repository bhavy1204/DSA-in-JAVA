public class Palindrome {

    public static boolean isPalindrome(String s){
        int n = s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(n-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "caaccaac";
        String s3 = "madam";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }   
}
