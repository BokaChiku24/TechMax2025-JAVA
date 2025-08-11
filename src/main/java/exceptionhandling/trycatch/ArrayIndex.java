package exceptionhandling.trycatch;

public class ArrayIndex {
    public static void main(String[] args) {
        System.out.println("Array Index Out of Bound Exception:");
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
