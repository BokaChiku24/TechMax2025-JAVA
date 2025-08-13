package exceptionhandling.caughthandled;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
            System.out.println("Program execution has been terminated.");
            System.exit(1); // Terminating the program with a non-zero exit code
        }
    }
}
