public class Reverse {
    public static void main(String[] args) {
        // String str = "Hello";
        // String reverse="";
        // while (str.length()!=0) {
        //     reverse += str.charAt(str.length()-1);
        //     str = str.substring(0, str.length() - 1);
        // }
        // System.out.println(reverse);


        // String str= "Helloy";
        // String reverse = new StringBuilder(str).reverse().toString();
        // System.out.println(reverse);

        String str = "Bhavy";
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length()-1; i >=0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.println(reverse);

    }
}

// Why StringBuilder instead of String?
// Avoid:
// String reverse = "";
// for (int i = str.length() - 1; i >= 0; i--) {
//     reverse += str.charAt(i);
// }

// Because String is immutable. Every += creates a new String, potentially making this O(n²).
