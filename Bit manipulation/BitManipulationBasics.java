public class BitManipulationBasics {
    public static void bitwiseAnd() {
        // Doing 'AND' operation between each bit of binary of the numbers.
        int a = 5; // 101
        int b = 7; // 111

        System.out.println(a & b);
        System.out.println(1 & 2);// 001 & 010 = 000
    }

    public static void bitwiseOr() {
        // Doing 'OR' operation between each bit of binary of the numbers.
        int a = 5;
        int b = 7;
        System.out.println(a | b);
        System.out.println(2 | 1);
        System.out.println(4 | 2);
    }

    public static void exor() {
        // peforming the 'Exor' or 'exclusive-or' operation between each bit of the
        // number
        // Exor truth table:-
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0
        int a = 5;
        int b = 7;
        System.out.println(a ^ b);
        System.out.println(3 ^ 4);
        System.out.println(9 ^ 7);
    }

    public static void rightShiftOperator() {
        // In this we convert the LHS number into binary and discard the number of
        // digits on right of it , the number wof time written on LHS on the expression
        // 5 = 101
        // 5>>2 => discard the "01", as the RHS contains 2, SO kind of shift the whole
        // number 2 places to the right.
        // Formmula :-
        // a>>b = a/(2^b)
        int a = 5;
        System.out.println(a >> 2);
        System.out.println(6 >> 2);
        System.out.println(8 >> 2);
        System.out.println(8 >> 3);
        System.out.println(2 >> 2);
    }

    public static void leftShiftOperator() {
        // shift the whole number 2 places to the left and put zeros in the right. Than
        // compute the whole number
        // Formmula :-
        // a>>b = a*(2^b)
        int a = 5;
        System.out.println(a << 2);
        System.out.println(6 << 2);
        System.out.println(8 << 2);
        System.out.println(8 << 3);
        System.out.println(2 << 2);
    }

    public static void onesComplement() {
        // Convert the zero to one and one to zero of each bit of binary.
        // Answer comes -ve because it converts MSB to 1 which signifies 'sign' of the
        // number.
        // MSB = 0 => positive
        // MSB =1 => negative
        int a = 5;
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a)); // For full bit view
        System.out.println(Integer.numberOfLeadingZeros(Math.abs(~a))); // Leading zeros in magnitude
        // Formula:- 
        // ~a = -(a+1)
    }

    public static void main(String[] args) {
        // bitwiseAnd();
        // bitwiseOr();
        // rightShiftOperator();
        // leftShiftOperator();
        // exor();
        onesComplement();
    }
}
