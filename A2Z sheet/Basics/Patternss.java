public class Patternss {

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    static void pattern8(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < n * 2 - (2 * i + 1); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n * 2 - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            // space

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space -= 2;

            // number
            for (int j = i; j >= 1; j--)
                System.out.print(j);

            System.out.println("");
        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println("");
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char c = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // chars
            char ch = 'A';
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j < (2 * i + 1) / 2) {
                    System.out.print(ch++);
                } else {
                    System.out.print(ch--);
                }
            }

            // spaace
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }

            ch -= 1;

            System.out.println();
        }
    }

    static void pattern19(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void pattern20(int n) {

    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 4;

        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        pattern18(n);

    }
}