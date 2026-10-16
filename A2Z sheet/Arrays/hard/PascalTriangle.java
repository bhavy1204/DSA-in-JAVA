public class PascalTriangle {

    public static void printTriangle(int n){
        for (int i = 0; i < n; i++) {
            int value=1;
            for (int j = 0; j <=i; j++) {
                System.out.print(value + " , ");
                value = value * (i-j)/(j+1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }    
}
