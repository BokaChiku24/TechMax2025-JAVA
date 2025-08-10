package javabasics.operators.bitwise;

public class Bitwise {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 4;
        System.out.println("a & b: " + (a & b)); // Bitwise AND operator
        System.out.println("a | b: " + (a | b)); // Bitwise OR operator
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR operator
        System.out.println("~a: " + (~a)); // Bitwise NOT operator
        System.out.println("a << 1: " + (a << 1)); // Left shift operator
        System.out.println("a >> 1: " + (a >> 1)); // Right shift operator
        System.out.println("a >>> 1: " + (a >>> 1)); // Zero-fill right shift operator
    }
}
