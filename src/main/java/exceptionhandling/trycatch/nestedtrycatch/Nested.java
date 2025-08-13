package exceptionhandling.trycatch.nestedtrycatch;

public class Nested {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        try {
            System.out.println("Inside outer try block");
            int a = 0;
            int b = 10 / a; // Throws ArithmeticException
            try {
                System.out.println("Inside inner try block");
                int c = 5;
                int d = 0;
                int e = c / d; // Throws ArithmeticException
            } catch (NumberFormatException e) {
                System.out.println("ArithmeticException occurred in inner try block: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException occurred in inner try block: " + e.getMessage());
            } finally {
                System.out.println("Inside inner try block finally block");
            }
        } catch (NumberFormatException e) {
            System.out.println("ArithmeticException occurred in outer try block: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred in outer try block: " + e.getMessage());
        } finally {
            System.out.println("Inside outer try block finally block");
        }
    }
}
