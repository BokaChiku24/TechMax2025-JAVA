package exceptionhandling.throwconcept;

public class Throw {
    static void testMethod() {
        try {
            throw new NullPointerException("Custom Exception occurred");
        } catch (NullPointerException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            testMethod();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
