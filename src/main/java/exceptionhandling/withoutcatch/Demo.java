package exceptionhandling.withoutcatch;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        try {
            methOperation();
        } finally {
            System.out.println("Inside finally block");
        }
    }

    static void methOperation() {
        System.out.println("Inside methOperation method");
        try {
            int result = 3 / 0; // Throws ArithmeticException
        } finally {
            System.out.println("Inside methOperation finally block");
        }
    }
}
