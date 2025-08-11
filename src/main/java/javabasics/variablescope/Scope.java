package javabasics.variablescope;

public class Scope {
    static int x; // x is a global variable

    public static void main(String[] args) {
        Scope.methodOne();
        Scope.methodTwo();
    }

    public static void methodOne() {
        int y; // y is a local variable inside methodOne
        System.out.println("x = " + x); // Accessible here
        y = 10;
        System.out.println("y = " + y); // Accessible here
        x = y;
        System.out.println("x = " + x); // Accessible here
    }

    public static void methodTwo() {
        int z = 2; // z is a local variable inside methodTwo
        System.out.println("x = " + x); // Accessible here
        // System.out.println("y = " + y); // Not accessible here
        System.out.println("z = " + z); // Accessible here
        x = z;
        System.out.println("x = " + x); // Accessible here
    }
}
