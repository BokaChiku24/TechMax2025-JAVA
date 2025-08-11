package exceptionhandling.throwsconcept;

public class Throws {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Inside main method");
        int i = 0;
        int j = 10 / i; // Throws ArithmeticException
        System.out.println("This line will not be executed");
    }
}
