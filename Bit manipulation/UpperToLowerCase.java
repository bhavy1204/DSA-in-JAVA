public class UpperToLowerCase {

    public static void toLowerCase(){
        char ch;
        for (char c='A'; c < 'Z'; c++) {
           ch = (char)(c|' '); 
           System.out.print(ch+" ");
        }
    }

    public static void main(String[] args) {
        toLowerCase();
    }
}
