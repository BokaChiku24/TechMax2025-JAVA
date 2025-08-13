package exceptionhandling.uncaughtunhandled;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // This will throw ArithmeticException
        System.out.println("Result: " + result); // This line will not be executed
    }
}
