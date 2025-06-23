public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch='a'; ch < 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        // sb.toString();
        sb.delete(3, 5);
        System.out.println(sb);
        sb.reverse();
        // sb.capacity();
        // sb.length();
        System.out.println(sb);
    }   
}
