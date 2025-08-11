package exceptionhandling.trycatch;

public class TryCatch {
    public static void main(String[] args) {
        int a = 20, b = 5, c = 5;
        int x, y;
        try {
            x = a / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
            x = 0; // Replace x with a default value if necessary
        }
        y = a / (b + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
