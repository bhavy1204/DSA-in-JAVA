public class BasicsOfStrings {
    public static void main(String[] args) {
        // # methods of declaring the string
        char str1[] = { 'a', 'b', 'c', 'd' };
        System.out.println(str1);

        String str2 = "Hello World";
        System.out.println(str2);

        String str3 = new String("Hello World     ");
        System.out.println(str3);

        // Length of strings
        System.out.println(str1.length);
        System.out.println(str2.length());
        System.out.println(str3.length());

        // To check equality
        System.out.println(str2.equals(str3));
        System.out.println(str2 == str3);

        // common methods on String
        System.out.println("---------------\nSTR3: "+str3);
        System.out.println(str3.charAt(3));
        System.out.println(str3.substring(3, 5));
        System.out.println(str3.substring(6));
        System.out.println(str3.trim());

        // Concatination + Strinngs are IMMUTABLE, if any change than return the whole new string else no change is reflected
        String str4 = str2 + str3;
        System.out.println(str4);
        str4 = str4+" This is new concatate";
        System.out.println(str4);

        str4.concat("...The end"); //Observe the output
        System.out.println(str4);

        str4 = str4.concat("...The end"); //Observe the output
        System.out.println(str4);

        System.out.println("hello "+", "+" world");

    }
}