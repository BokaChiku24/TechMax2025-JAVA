package exceptionhandling.finallyblock;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {5, 10};
        int b = 5;
        try {
            int x = numbers[2] / b - numbers[1];
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound Exception occurred: " + e.getMessage());
        } catch (ArrayStoreException e) {
            System.out.println("Array Store Exception occurred: " + e.getMessage());
        } finally {
            int y = numbers[1] / numbers[0];
            System.out.println("y = " + y);
        }

    }
}
