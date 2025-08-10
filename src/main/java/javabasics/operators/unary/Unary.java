package javabasics.operators.unary;

public class Unary {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Increment: " + (++num)); // Increment operator with prefix increment
        System.out.println("Increment: " + (num++)); // Increment operator with postfix increment
        System.out.println("Decrement: " + (--num)); // Decrement operator with prefix decrement
        System.out.println("Decrement: " + (num--)); // Decrement operator with postfix decrement
        System.out.println("Unary negation: " + -num); // Unary negation operator
        System.out.println("Bitwise NOT: " + ~num); // Bitwise NOT operator
    }
}
