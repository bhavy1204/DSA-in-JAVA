import java.util.*;

public class TwoDArrayBasics {

    public static void simple2DArray() {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter element [" + i + "," + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----------------- 2D ARRAY --------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

    public static void jaggedArray() {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[sc.nextInt()];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("enter element [" + i + "," + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

    public static void main(String[] args) {
        simple2DArray();
        System.out.println("---------- jagged array ---------------");
        jaggedArray();

    }
}