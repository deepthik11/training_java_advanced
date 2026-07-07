public class BitwiseShiftDemo {
    public static void main(String[] args) {
        int a = 10;   // Binary: 1010
        int b = 5;    // Binary: 0101

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));   // AND
        System.out.println("a | b = " + (a | b));   // OR
        System.out.println("a ^ b = " + (a ^ b));   // XOR
        System.out.println("~a = " + (~a));         // NOT

        // Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println("a << 1 = " + (a << 1)); // Left Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned Right Shift
    }
}